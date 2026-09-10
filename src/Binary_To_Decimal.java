import java.util.*;

class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % 10;
            decimal += digit * power;
            power *= 2;
            n /= 10;
        }

        System.out.println(decimal);
    }
}