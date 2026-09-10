import java.util.*;

class Fibonacci_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        boolean found = false;

        while (a <= n) {
            if (a == n) {
                found = true;
                break;
            }

            int c = a + b;
            a = b;
            b = c;
        }

        if (found)
            System.out.println("Fibonacci");
        else
            System.out.println("Not Fibonacci");
    }
}