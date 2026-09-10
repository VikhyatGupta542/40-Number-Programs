import java.util.*;

class Power_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++)
            result *= base;

        System.out.println(result);
    }
}