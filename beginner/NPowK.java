import java.util.*;
class NPowK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;        
        long n = sc.nextInt();
        int l = Integer.parseInt(String.valueOf(n));
        int k = sc.nextInt();
        for(i=1;i<k;i++){
            n = n*l;
        }
        System.out.println(n);
    }
}
