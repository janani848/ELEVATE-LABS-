import java.util.Scanner;

public class Calculator {
    
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("❌ Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueCalc;

        do {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (operator) {
                case '+': result = add(num1, num2); break;
                case '-': result = subtract(num1, num2); break;
                case '*': result = multiply(num1, num2); break;
                case '/': result = divide(num1, num2); break;
                default:
                    System.out.println("❗ Invalid operator.");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result = " + result);
            }

            System.out.print("Do you want to continue? (yes/no): ");
            continueCalc = sc.next();

        } while (continueCalc.equalsIgnoreCase("yes"));

        System.out.println("✅ Calculator session ended.");
        sc.close();
    }
}
