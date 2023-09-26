import java.util.*;

public class Week{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        if (num==1){
            System.out.println("this is monday");
        }
        else if(num==2){
            System.out.println("this is tuesday");
        }
        else if (num==3){
            System.out.println("this is wednesday");
        }
        else if (num==4){
            System.out.println("this is thursday");
        }
        else if (num==5){
            System.out.println("this is friday");
        }
        else if (num==6){
            System.out.println("this is saturday");
        }
        else if (num==7){
            System.out.println("this is sunday");
        }
        else {
            System.out.println("this is not in week");
        }
    }
}