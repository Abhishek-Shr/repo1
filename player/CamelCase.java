import java.io.*;
import java.util.*;
public class Guvi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        String s = sc.nextLine();
        char[] c = s.toCharArray();        
        c[0] = (char)(c[0]-32);
        for(i = 1; i < c.length; i++){
            if(i+1 > c.length-1)
            break;
            if(c[i] == ' '){
                if(96 < c[i+1] && c[i+1] < 123){
                    c[i+1] = (char)(c[i+1]-32);                    
                }
            }
            if(c[i-1]!=' '){
                if(64 < c[i] && c[i] < 92){
                    c[i] = (char)(c[i]+32);
                }   
            }
        }
        if(64 < c[c.length-1] && c[c.length-1] < 92){
            c[c.length-1] = (char)(c[c.length-1]+32);           
        }
        if(96 < c[c.length-1] && c[c.length-1] < 123 && c[c.length-2] == ' '){
            c[c.length-1] = (char)(c[c.length-1]-32);           
        }
        System.out.println(String.valueOf(c));
    }
}
