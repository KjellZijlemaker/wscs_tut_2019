//CALCULATOR CLIENT
import java.util.*;
public class CalculatorClient {
 
    public static void main(String[] args) {
        CalculatorServiceService service = new CalculatorServiceService();
        CalculatorService calc = service.getCalculatorServicePort();
        Scanner scan = new Scanner(System.in);
       // String input = "";

        //NON-INTERACTIVE MODE
        System.out.println("NON-INTERACTIVE (HARDCODED INPUT)");
        System.out.println("Adding: 1+2 = "+calc.add(1, 2));
        System.out.println("Subtracting: 2-2 = "+calc.sub(2, 2));
        System.out.println("Multiplying: -2.5*4 = "+calc.mul(-2.5f, 4));
        System.out.println("Dividing: 6.78/3.12 = "+calc.div(6.78f, 3.12f));

        System.out.println("Press [y] or [n] if you would like to try out interactive mode");
        String input = scan.nextLine();
        if(input.equals("n")){
        	System.out.println("Goodbye");
        }
        else if(input.equals("y")){
        	//INTERACTIVE MODE
        	String choice = "";
        	System.out.println("press 'a' to add");
        	System.out.println("press 's' to subtract");
        	System.out.println("press 'm' to multiply");
        	System.out.println("press 'd' to divide");
        	System.out.println("press 'q' to quit");
         	do {
            	choice = scan.nextLine();
            	switch (choice) {
            	case "a":
            		System.out.println("Enter two numbers (floats) you would like to add.");
            		System.out.print("Float 1: ");
            		float float1a = scan.nextFloat();
            		System.out.print("Float 2: ");
            		float float2a = scan.nextFloat();
            		System.out.println("Answer: "+calc.add(float1a, float2a));
            		System.out.println("Please enter your choice from the menu to continue.");
            		break;
            	case "s":
            		System.out.println("Enter two numbers (floats) you would like to subtract.");
            		System.out.print("Float 1: ");
            		float float1s = scan.nextFloat();
            		System.out.print("Float 2: ");
            		float float2s = scan.nextFloat();
            		System.out.println("Answer: "+calc.sub(float1s, float2s));
            		System.out.println("Please enter your choice from the menu to continue.");
            		break;
            	case "m":
            		System.out.println("Enter two numbers (floats) you would like to multiply.");
            		System.out.print("Float 1: ");
            		float float1m = scan.nextFloat();
            		System.out.print("Float 2: ");
            		float float2m = scan.nextFloat();
            		System.out.println("Answer: "+calc.mul(float1m, float2m));
            		System.out.println("Please enter your choice from the menu to continue.");
            		break;
            	case "d":
            		System.out.println("Enter two numbers (floats) you would like to divide.");
            		System.out.print("Float 1: ");
            		float float1d = scan.nextFloat();
            		System.out.print("Float 2: ");
            		float float2d = scan.nextFloat();
            		System.out.println("Answer: "+calc.div(float1d, float2d));
            		System.out.println("Please enter your choice from the menu to continue.");
            		break;
  
            	} // end of switch
        	} while (!choice.equals("q")); // end of loop

        }       
         
    }
}