import java.io.*;
import java.util.*;
public class SpaceInSentence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,count = 0;
        String s = sc.nextLine();
        // word count program. 
        //String[] w = s.split(" ");
        //count = w.length;
        char[] c = s.toCharArray();
        for(i = 0; i < c.length; i++){
            if(c[i] == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
