import java.io.*;
import java.util.*;
public class position{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        char temp;
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        for(i = 0; i < c.length; i+=2){
            if((i+2) < c.length){
            temp = c[i];
            c[i] = c[i+1];
            c[i+1] = temp;
            }
        }
        System.out.println(String.valueOf(c));
    }
}
