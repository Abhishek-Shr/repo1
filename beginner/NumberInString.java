import java.io.*;
import java.util.*;
public class NumberInString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,count = 0;
        String s = sc.nextLine();        
        char[] c = s.toCharArray();
        for(i = 0; i < c.length; i++){
            try{
                s = ""+c[i];
                Integer.parseInt(s);
                count++;
            }
            catch(Exception e){
            }        
        }
        System.out.println(count);
    }
}
