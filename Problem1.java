import java.util.Scanner;

class Calculator {
    private double a, b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else throw new ArithmeticException("Division by zero not allowed");
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        System.out.println("Result: " + calc.calculate());
    }
}
