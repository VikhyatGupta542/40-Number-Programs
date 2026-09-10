import java.util.*;

class Sunny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n + 1;
        boolean found = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Sunny");
        else
            System.out.println("Not Sunny");
    }
}