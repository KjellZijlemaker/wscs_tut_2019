//CALCULATOR CLIENT
public class CalculatorClient {
 
    public static void main(String[] args) {
        CalculatorServiceService service = new CalculatorServiceService();
        CalculatorService calc = service.getCalculatorServicePort();
         
        System.out.println(calc.add(1, 2));
        System.out.println(calc.sub(2, 2));
        System.out.println(calc.mul(2, 4));
        System.out.println(calc.div(6, 3));
    }
 
}