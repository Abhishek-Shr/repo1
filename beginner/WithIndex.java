import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] a = s.split(" ");
        int[] arr = new int[n];
        for(i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(a[i]);
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+i);
        }
    }
}
