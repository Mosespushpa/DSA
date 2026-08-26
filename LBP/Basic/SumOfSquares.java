import java.util.*;
class SumOfSquares{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the Sum of Squares of N Natural Numbers");
        System.out.println("Choose a approach \n1 Iterative approach\n2 for Recursice approach\n3 for formula based");
        int ch = sc.nextInt();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

       SumOfSquares t = new SumOfSquares();
        if(ch ==1) t.iterative(n);
        else if(ch ==2) System.out.println("Sum of "+n+" Natural numbers is "+t.recursive(n));
        else if(ch ==3) t.formula(n);
        else System.out.println("Invalid choice");
        
    }

    void iterative(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum  + (i*i);
        }
        System.out.println("Sum of "+n+" Natural numbers is "+sum);
    }
    int recursive(int n){
        
        if(n == 0) return 0;
        else{
            return (n*n) + recursive(n-1);
        }
    }
    
    void formula(int n){
        int sum = ((n)*(n+1)*((2*n)+1))/6;
        System.out.println("Sum of "+n+" Natural numbers is "+sum);
    }
}