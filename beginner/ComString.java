import java.util.*;

class ComString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        String s = sc.nextLine();
        String r = sc.nextLine();
        int l1 = s.length();
        int l2 = r.length();
        if(l1 == l2){
            System.out.println(s);
        }
        else if(l1 > l2){
            System.out.println(s);
        }
        else{
            System.out.println(r);
        }
    }
}
