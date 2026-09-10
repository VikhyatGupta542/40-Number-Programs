import java.util.*;

class Swap_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println(n);
            return;
        }

        int last = n % 10;
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int power = 1;
        for (int i = 1; i < digits; i++)
            power *= 10;

        int first = n / power;
        int middle = (n % power) / 10;

        int result = last * power + middle * 10 + first;

        System.out.println(result);
    }
}