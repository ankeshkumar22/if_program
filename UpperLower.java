import java.util.*;

public class UpperLower{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        char ch = sc.next().charAt(0);

        //if (ch>='a' && ch<='z'){
        if (ch>=97 && ch<=122) {
            System.out.println(ch + " is the lower case");
        }
        //else if (ch>='A' && ch<='Z'){
        else if (ch>=65 && ch<=90){
            System.out.println(ch + " is the upper case");
        }
        else {
            System.out.println(ch + " is not alphabate");
        }
    }
}