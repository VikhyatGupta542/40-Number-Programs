import java.util.*;

class Disarium_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;
        int sum = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 0; i < digits; i++)
                power *= digit;

            sum += power;
            digits--;
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Disarium");
        else
            System.out.println("Not Disarium");
    }
}