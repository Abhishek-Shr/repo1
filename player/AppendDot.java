import java.io.*;
import java.util.*;
public class AppendDot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        s1.append(".");
        String s2 = new String(s1);        
        System.out.println(s2);
    }
}
