import java.util.*;

class Factorial{
    // Using Recursive Function to Calculate Factorial of N
    int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n*fact(n-1);
    }
    
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial fn = new Factorial();
        System.out.println("By using Recursive Function\nFactorial of "+n+" is "+fn.fact(n)+"\n\n");
        sc.close();
    }
}