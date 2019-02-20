import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String s = sc.nextLine();
        try {
            double a = Double.parseDouble(s);
            System.out.println("Yes");
        } catch (Exception e) {
            System.out.print("No");
        }
    }
}
