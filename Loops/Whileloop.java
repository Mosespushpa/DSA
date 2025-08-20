import java.io.*;
import java.util.*;

class Whileloop{
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);

        // Program to print 1 to N space separated on single line.
        System.out.print("Enter N to print 1 to N : ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            System.out.print((i++)+" ");
        }
        System.out.println();
        
        // Program to print N to 1 space separated on single line.
        System.out.print("Enter N to print N to 1 : ");
        int n1 = sc.nextInt();
        while(n1 >= 1){
            System.out.print((n1--)+" ");
        }
        System.out.println();

        // Program to print N even numbers space separated on single line.
        System.out.print("Enter N to print Even numbers upto N : ");
        int n2 = sc.nextInt();
        int i1 = 2;
        while(i1 <= n2){
            if(i1 % 2 == 0){
                System.out.print((i1)+" ");
            } 
            i1++;
        }
        System.out.println();
    }
}