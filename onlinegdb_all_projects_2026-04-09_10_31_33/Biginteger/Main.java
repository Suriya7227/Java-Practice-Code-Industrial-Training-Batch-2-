import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        BigInteger a = sc.nextBigInteger();

        System.out.print("Enter second number: ");
        BigInteger b = sc.nextBigInteger();

        BigInteger result = a.multiply(b);

        System.out.println("Multiplication = " + result);
    }
}