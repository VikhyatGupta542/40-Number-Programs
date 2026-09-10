import java.util.Scanner;
public class Automorphic_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n * n;

        if (String.valueOf(square).endsWith(String.valueOf(n)))
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");
    }
}
