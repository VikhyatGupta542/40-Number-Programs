import java.util.*;

class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary = 0;
        int place = 1;

        while (n > 0) {
            int remainder = n % 2;
            binary += remainder * place;
            place *= 10;
            n /= 2;
        }

        System.out.println(binary);
    }
}