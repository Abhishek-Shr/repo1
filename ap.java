import java.util.Scanner;

public class Practise{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] A = s.split(" ");
        int n = Integer.parseInt(A[0]);
        int a = Integer.parseInt(A[1]);
        int d = Integer.parseInt(A[2]);
        int sum = n*(2*a+(n-1)*d);
        System.out.println(sum/2);
    }
}
