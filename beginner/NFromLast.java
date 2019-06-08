import java.util.*;
class NFromLast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] t = in.split(" ");
        String s = t[0];
        int n = Integer.parseInt(t[1]);
        int l = s.length();
        System.out.println(s.substring(l-n, l));

    }
}
