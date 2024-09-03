import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("Choose an operation (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }
    }

    /**
     * Adds two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of num1 and num2.
     */
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts num2 from num1.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The difference of num1 and num2.
     */
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of num1 and num2.
     */
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides num1 by num2.
     *
     * @param num1 The dividend.
     * @param num2 The divisor.
     * @return The quotient of num1 and num2.
     */
    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
