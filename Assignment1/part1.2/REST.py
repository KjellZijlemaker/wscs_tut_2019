from flask import Flask, request, abort
from flask_restful import Resource, Api
from sqlalchemy import create_engine
from json import dumps
from flask_jsonpify import jsonify
from nanoid import generate # To generate small ID's
import re

app = Flask(__name__)
api = Api(app)
urls = {}
max_id_size = 10
regex = re.compile(
        r'^(?:http)s?://' # http:// or https://
        r'(?:(?:[A-Z0-9](?:[A-Z0-9-]{0,61}[A-Z0-9])?\.)+(?:[A-Z]{2,6}\.?|[A-Z0-9-]{2,}\.?)|' #domain lookup
        r'localhost|' # Localhost can be looked up
        r'\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})' # IP can be looked up
        r'(?:/?|[/?]\S+)$', re.IGNORECASE) # Can be put in upper case

class GetURL(Resource):
    def get(self):
        if not 'id' in request.args:
            return {'keys': urls}, 201 
        try:
            id = request.args['id']
        except:
            abort(404)
        return {'value': urls[id]}, 200 


class PutURL(Resource):
    def put(self):
        try:
            id = request.args['id']
            if not re.match(regex, request.form['url']): # check if input is URL
                abort(400)
            urls[id] = request.form['url']
        except:
            abort(404)
        return {}, 200 


class DeleteURL(Resource):
    def delete(self):
        if not 'id' in request.args:
            return {}, 204
        try:
            id = request.args['id']
            del urls[id]
        except:
            abort(404)
        return {}, 204


class NewUrl(Resource):
    def post(self):
        if not re.match(regex, request.form['url']): # check if input is URL
            abort(400)
        id = generate(size=max_id_size)
        urls[id] = request.form['url']
        return {'id': id}, 201


# Set resource pointers
api.add_resource(GetURL, '/')
api.add_resource(PutURL, '/')
api.add_resource(DeleteURL, '/') 
api.add_resource(NewUrl, '/') 


if __name__ == '__main__':
     app.run(port='5002')