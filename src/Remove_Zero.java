import java.util.*;

class Remove_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                result += digit * place;
                place *= 10;
            }

            n /= 10;
        }

        System.out.println(result);
    }
}