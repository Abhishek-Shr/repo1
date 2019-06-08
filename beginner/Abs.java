import java.io.*;
import java.util.*;

class Abs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr,min,i;
        //String str = sc.nextLine();
        //String[]  s =  str.split(" ");
        int[] arr = new int[4];
        for(i=0;i<4;i++){
           // arr[i] = Integer.parseInt(s[i]);
           arr[i] = sc.nextInt();
        }
        System.out.println(Math.abs(arr[0]-arr[2])+" "+Math.abs(arr[1]-arr[3]));
    }
}
