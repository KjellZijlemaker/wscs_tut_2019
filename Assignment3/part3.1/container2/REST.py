from flask import Flask, request, abort
from flask_restful import Resource, Api
from json import dumps
from flask_jsonpify import jsonify
from nanoid import generate  # To generate small ID's
import re

app = Flask(__name__)
api = Api(app)
urls = {}  # Dictionary for saving URLS
max_id_size = 10  # Max size of ID's can be changed here
regex = re.compile(
    r'^(?:http)s?://'  # http:// or https://
    # domain lookup
    r'(?:(?:[A-Z0-9](?:[A-Z0-9-]{0,61}[A-Z0-9])?\.)+(?:[A-Z]{2,6}\.?|[A-Z0-9-]{2,}\.?)|'
    r'localhost|'  # Localhost can be looked up
    r'\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})'  # IP can be looked up
    r'(?:/?|[/?]\S+)$', re.IGNORECASE)  # Can be put in upper case

# For get request


class GetURL(Resource):

    def get(self):
        if not 'id' in request.args:
            return {'keys': urls}, 201  # Return all keys when id is not given
        try:
            # Otherwise, check the URL and return the original URL
            id = request.args['id']
            urls[id]
        except:
            abort(404)
        return {'value': urls[id]}, 301

# For put request


class PutURL(Resource):

    def put(self):
        try:
            id = request.args['id']
            # check if input is URL
            if not re.match(regex, request.form['url']):
                abort(400)
            # Change the URL according to input from form
            urls[id] = request.form['url']
        except:
            abort(404)
        return {}, 200

# For delete request


class DeleteURL(Resource):

    def delete(self):
        if not 'id' in request.args:
            return {}, 204
        try:
            id = request.args['id']
            del urls[id]  # Delete the url from dictionary
        except:
            abort(404)
        return {}, 204

# For post request


class NewUrl(Resource):

    def post(self):
        print("Test")
        if not re.match(regex, request.form['url']):  # check if input is URL
            abort(400)
        # Generate new id and add it to the URL dictionary
        id = generate(size=max_id_size)
        urls[id] = request.form['url']
        return {'id': id}, 201


# Set resource pointers
api.add_resource(GetURL, '/')
api.add_resource(PutURL, '/')
api.add_resource(DeleteURL, '/')
api.add_resource(NewUrl, '/')


if __name__ == '__main__':
    app.config['SERVER_NAME'] = None
    app.run(host='0.0.0.0', port='81')
