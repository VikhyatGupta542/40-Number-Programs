import java.util.*;

class Magic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n >= 10) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        if (n == 1)
            System.out.println("Magic");
        else
            System.out.println("Not Magic");
    }
}