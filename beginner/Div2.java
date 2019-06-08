import java.util.*;
class Div2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n%2!=1){
            n=n/2;
        }
        System.out.println(n);
    }
}
