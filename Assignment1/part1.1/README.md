# Web Services and Cloud-Based Systems - Assignment 1.1

Write a   Calculator Web  service using   the two methods you have learned 
(Bottom-up  or  Top-Down). Write the respective  clients to  call your service in each case. Implement a web service using Java API for XML Web Services(JAX-WS) with    the following   interface:

§ method    add for addition

§ method    sub for substraction

§ method    mul for multiplication

§ method    div for division

o Calculator    should  operate on  real numbers

o Web   service should  communicate using   SOAP    protocol

## Getting Started

These instructions will get you a copy of the solution up and running on your local machine for development and testing purposes. 

### Prerequisites

Before running the client, you must have the following installed:

**NetBeans IDE**

**GlassFish Server** (should already be installed when installing NetBeans)

**Java version "1.8.0_201"** (JDK 8)

**Apache Maven 3.6.0** (to package the project into a WAR file)

### Setup, deploy & test the calculator web service

- Import the **calculator_maven** folder into NetBeans IDE
- NetBeans will detect this is a Maven project and install all the required depedencies.
- Make sure you install the GlassFish plugin in NetBeans
- Run the project in NetBeans 
- The calculator web service is now deployed
- You can now test the service by going to http://localhost:8080/calculator_maven/CalculatorServiceService?Tester

### Setup & run the client for the web service
We have already set up the client for the web service by generating Java classes using the WSDL file found in http://localhost:8080/calculator_maven/CalculatorServiceService?WSDL

WSDL file describes the public interface for the calculator web service. 

We have copied the contents of the WSDL file to calculator.wsdl

The following command generates the Java classes needed to write the client:

```
wsimport -keep -p client calculator.wsdl
```

We have written the java client (CalculatorClient.java)

To compile & run the client:
```
javac CalculatorClient.java
```

```
java CalculatorClient
```