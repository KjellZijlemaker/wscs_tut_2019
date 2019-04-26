
package com.calculator.calculator_maven;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class CalculatorService{

    public CalculatorService() {
    }

    @WebMethod
    public float add(float a, float b) {
        return a + b;
    }

    @WebMethod
    public float sub(float a, float b) {
        return a - b;
    }

    @WebMethod
    public float mul(float a, float b) {
        return a * b;
    }

    @WebMethod
    public float div(float a, float b) {
        return a / b;
    }
}
