import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Calculator{

    public Calculator() {
    }

    @WebMethod
    public Integer add(float a, float b) {
        return a + b
    }

    @WebMethod
    public Integer sub(float a, float b) {
        return a - b
    }

    @WebMethod
    public Integer mul(float a, float b) {
        return a * b
    }

    @WebMethod
    public Integer div(float a, float b) {
        return a / b
    }
}