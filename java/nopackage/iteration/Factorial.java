
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int f = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        System.out.println("The factorial is " + f);
    }
}