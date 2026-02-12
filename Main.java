import java.util.Scanner;
public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1: ");
        double a = sc.nextDouble();
        System.out.print("enter num2: ");
        double b = sc.nextDouble();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}

