
//package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculatorServiceService", targetNamespace = "http://calculator_maven.calculator.com/", wsdlLocation = "file:/Users/agukalpa/Documents/VU%20Amsterdam/Web%20Services%20and%20Cloud-Based%20Systems/assign1/calculator.wsdl")
public class CalculatorServiceService
    extends Service
{

    private final static URL CALCULATORSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULATORSERVICESERVICE_EXCEPTION;
    private final static QName CALCULATORSERVICESERVICE_QNAME = new QName("http://calculator_maven.calculator.com/", "CalculatorServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/calculator_maven/CalculatorServiceService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATORSERVICESERVICE_WSDL_LOCATION = url;
        CALCULATORSERVICESERVICE_EXCEPTION = e;
    }

    public CalculatorServiceService() {
        super(__getWsdlLocation(), CALCULATORSERVICESERVICE_QNAME);
    }

    public CalculatorServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATORSERVICESERVICE_QNAME, features);
    }

    public CalculatorServiceService(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORSERVICESERVICE_QNAME);
    }

    public CalculatorServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORSERVICESERVICE_QNAME, features);
    }

    public CalculatorServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorService
     */
    @WebEndpoint(name = "CalculatorServicePort")
    public CalculatorService getCalculatorServicePort() {
        return super.getPort(new QName("http://calculator_maven.calculator.com/", "CalculatorServicePort"), CalculatorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorService
     */
    @WebEndpoint(name = "CalculatorServicePort")
    public CalculatorService getCalculatorServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculator_maven.calculator.com/", "CalculatorServicePort"), CalculatorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATORSERVICESERVICE_EXCEPTION!= null) {
            throw CALCULATORSERVICESERVICE_EXCEPTION;
        }
        return CALCULATORSERVICESERVICE_WSDL_LOCATION;
    }

}