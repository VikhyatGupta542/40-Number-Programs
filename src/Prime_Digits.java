import java.util.*;

class Prime_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean allPrime = true;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                allPrime = false;
                break;
            }

            n /= 10;
        }

        if (allPrime)
            System.out.println("All Prime");
        else
            System.out.println("Not All Prime");
    }
}