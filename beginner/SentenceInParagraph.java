import java.io.*;
import java.util.*;
public class SentenceInParagraph{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,count = 0;
        String s = sc.nextLine();        
        String[] w = s.split("[.]");         
        count = w.length;        
        System.out.println(count);
    }
}
