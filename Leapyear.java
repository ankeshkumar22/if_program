import java.util.*;

public class Leapyear{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();

        if ((year%100==0) || (year%100!=0 && year%4==0)){
            System.out.println("the year is leap year");
        }
        else {
            System.out.println("the year is not leap year");
        }
    }
}