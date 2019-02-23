import java.io.*;
import java.util.*;
public class RomanNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i,count=0;
        char[] c = s.toCharArray();
        for(i = 0; i < c.length; i++){
            if(c[i]=='I')
                count+=1;
            if(c[i]=='V')
                count+=5;
            if(c[i]=='X')
                count+=10;
            if(c[i]=='L')
                count+=50;
            if(c[i]=='C')
                count+=100;
            if(c[i]=='D')
                count+=500;
            if(c[i]=='M')
                count+=10;
        }
        System.out.println(count);
    }
}
