import java.io.*;
import java.util.*;
public class Guvi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,count = 0,j;
        String s = sc.nextLine();
        String s1;
        char[] c = s.toCharArray();
        char[] c1 = new char[c.length];
        for(i=0; i<c.length; i++){
            c1[c.length-i-1] = c[i];
        }
        s1 = String.valueOf(c1);
        System.out.println(s1);
    }
}
