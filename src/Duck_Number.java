import java.util.*;

class Duck_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        if (n.contains("0"))
            System.out.println("Duck");
        else
            System.out.println("Not Duck");
    }
}