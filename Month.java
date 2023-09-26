import java.util.*;

public class Month{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the month b/w (1-12) : ");
        int month = sc.nextInt();

        if (month==1){
            System.out.println("january , 31 days");
        }
        else if (month==2){
            System.out.println("februry , 28 / 29 days");   
        }
        else if (month==3){
            System.out.println("march , 31 days");
        }
        else if (month==4){
            System.out.println("april , 30 days");
        }
        else if (month==5){
            System.out.println("may , 31 days");
        }
        else if (month==6){
            System.out.println("june , 30 days");
        }
        else if (month==7){
            System.out.println("july , 31 days");
        }
        else if (month==8){
            System.out.println("august , 31 days");
        }
        else if (month==9){
            System.out.println("september , 30 days");
        }
        else if (month==10){
            System.out.println("octomber , 31 days");
        }
        else if (month==11){
            System.out.println("november , 30 days");
        }
        else if (month==12){
            System.out.println("december , 31 days");
        }
        else {
            System.out.println("Not valid ! please enter the month b/w (1-12) : ");
        }
    }
}