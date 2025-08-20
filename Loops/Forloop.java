import java.util.*;

class Forloop{
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);

        // Program to print 1 to N numbers space separated on single line.
        System.out.print("Enter N to print 1 to N : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        
        // Program to print 1 to N Squares of each number space separated on single line.
        System.out.print("Enter N to print 1 to N Squares : ");
        int n1 = sc.nextInt();
        for(int i=1;i<=n1;i++){
            System.out.print((i*i)+" ");
        }
        System.out.println();

        // Program to print N odd numbers space separated on single line.
        System.out.print("Enter N to print odd numbers upto N : ");
        int n2 = sc.nextInt();
        int c = 0;
        for(int i=1;c<=n2;i = i + 2){
            System.out.print(i+" ");
            c++;
        }
        System.out.println();
     sc.close();    
    }
}