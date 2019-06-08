import java.util.*;
class NFromLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int l = s.length();
        System.out.println(s.substring(l-n, l));

    }
}
