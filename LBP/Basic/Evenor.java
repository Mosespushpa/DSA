package Logic_Building_Problems.Basic;
import java.util.*;
import java.io.*;
public class Evenor{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether a number is even or odd");
        System.out.println("Choose a approach \n1 for Remainder approach\n2 for Bitwize approach");
        int ch = sc.nextInt();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        Evenor eo = new Evenor();
        if(ch ==1) eo.modulo(n);
        else eo.bit(n);
        
    }

    void modulo(int n){
        if(n%2 == 0){
            System.out.println(n+" is an Even number");
        }
        else{
            System.out.println(n+" is an Odd number");
        }
    }

    void bit(int n){
        if((n&1) == 1){
            System.out.println(n+" is an Odd number");
        }
        else{
            System.out.println(n+" is an Even number");
        }
    }
}