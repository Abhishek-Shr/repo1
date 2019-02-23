import java.io.*;
import java.util.*;
public class SpecialCharInString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,count = 0,j;
        String s = sc.nextLine();      
        char[] c = s.toCharArray();
        char[] special = {'@','#','!','$','%','^','/',',','.','&','*',
        '(',')','[',']',':',';','?','`','-','+','+','_'};
        for(i = 0; i < c.length; i++){
            for(j = 0; j < special.length; j++){
                if(c[i] == special[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
