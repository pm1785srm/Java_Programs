import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        input.nextLine();  // Consume the newline character
        String op = input.nextLine();

        System.out.print("Enter num 2: ");
        double num2 = input.nextDouble();

        if(op.equals("+")){
            System.out.println("Addition: " + (num1 + num2));
        }
        else if(op.equals("-")){
            System.out.println("Subtraction: " + (num1 - num2));
        }
        else if(op.equals("*")){
            System.out.println("Multiplication: " + (num1 * num2));
        }
        else if(op.equals("/")){
            System.out.println("Division: " + (num1 / num2));
        }
        else {
            System.out.println("Enter Correct Operator");
        }
    }
}
