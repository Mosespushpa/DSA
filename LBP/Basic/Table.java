package Logic_Building_Problems.Basic;
import java.util.*;
import java.io.*;
public class Table{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the Multiplication Table");
        System.out.println("Choose a approach \n1 Iterative approach\n2 for Recursice approach");
        int ch = sc.nextInt();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        Table t = new Table();
        if(ch ==1) t.iterative(n);
        else t.recursive(n,1);
        
    }

    void iterative(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+(i)+" = "+(n*i));
        }
    }

    void recursive(int n,int i){
        if(i == 11) return;
        System.out.println(n+" * "+(i)+" = "+(n*i));
        recursive(n,i+1);
    }
}