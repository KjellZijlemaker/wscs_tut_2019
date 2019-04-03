from flask import Flask, request
from flask_restful import Resource, Api
from sqlalchemy import create_engine
from json import dumps
from flask_jsonpify import jsonify

# db_connect = create_engine('sqlite:///chinook.db') // For DB
app = Flask(__name__)
api = Api(app)

class GetURL(Resource):
    urls = []

    def get(self):
        return {'id': 301} # Fetches first column that is Employee ID


class PutURL(Resource):
    def put(self):
        return {'id': 200} # Fetches first column that is Employee ID


class DeleteURL(Resource):
    def get(self):
        return {'id': 204} # Fetches first column that is Employee ID


class GetKeys(Resource):
    def get(self):
        return {'id': 200} # Fetches first column that is Employee ID


class NewUrl(Resource):
    def get(self):
        return {'id': 201} # Fetches first column that is Employee ID


class RemoveURL(Resource):
    def get(self):
        return {'id': 204} # Fetches first column that is Employee ID


api.add_resource(GetURL, '/id') # Set ID parameter
api.add_resource(PutURL, '/id') # Set ID parameter
api.add_resource(DeleteURL, '/id') # Set ID parameter
api.add_resource(GetKeys, '/') # Set ID parameter
api.add_resource(NewUrl, '/') # Set ID parameter
api.add_resource(RemoveURL, '/') # Set ID parameter




if __name__ == '__main__':
     app.run(port='5002')