import java.util.*;

public class Alphadigitchar {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the char : ");
        char ch = sc.next().charAt(0);

        if ((ch>='a' && ch<='z') || (ch>'A' && ch>'Z')) {
            System.out.println(ch + " is the alphabate");
        }
        else if (ch>='0' && ch<='9'){
            System.out.println(ch + " is the digit");
        }
        else {
            System.out.println(ch + " is the special character"); 
        }
    }
}