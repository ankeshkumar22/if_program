import java.util.*;

public class Divi{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if (n%5==0 && n%11==0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}