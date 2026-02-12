import java.util.Scanner;
public class swapnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping:");
        System.out.println("first number: " + a);
        System.out.println("second number: " + b);
    }
}
