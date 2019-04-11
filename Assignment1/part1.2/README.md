# Web Services and Cloud-Based Systems - Assignment 1.2

Write	a	REST	URL-shortener service.	

§ URL-shortener	can	store	multiple	addresses,	it	assigns	unique	id	to	every	new	url,	ids	should	be	as	short	as	possible	and	on	demand,	extended,

§ For	full	amount	of	points,	URLs	are	suppose	to	be	checked	for	correctness	(regular	expression),	

§ URL-shortener	can	store	data	in	memory	– it	does	not	have	to	maintain	state	between	restarts

## Getting Started

These instructions will get you a copy of the solution up and running on your local machine for development and testing purposes. 

### Prerequisites

Before running the script, make sure to have python3.7.3 installed on your machine. This can be easily done with help of pip

```
sudo easy_install pip
```

Install required packages
```
pip3 install -r requirements.txt
```

### Setup, deploy & test the URL shortener web service
The REST server can be deployed on any server supporting Python. Extract the REST.py file in any directory where the server has access.
To run the REST server, run the REST.py file from the command line with Python or create an automated script which will call the script at server startup. The REST server will be listening on localhost:5002.

### Setup & run the client for the web service
Extract the index.html in a directory of the client server, which can be a simple HTTP server running on port 80. Finally, open the URL on which the index file is hosted in a web browser and make sure the REST server is running. Also make sure that CORS is enabled everywhere, or make sure that both the client and REST server are hosted on the same domain to prevent Cross Origin Requests.  
