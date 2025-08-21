import java.util.*;

class SumofDigits{
    // Using Loops to Calculate sum of N numbers
    int sumwithLoop(int n){
        int sum1 = 0;
        for(int i=1;i<=n;i++){
                sum1 = sum1 + i;
        }
        return sum1;
    }
    // Using Sum of N numbers Fromula
    int sumwithFormula(int n){
        return (n*(n+1))/2;
    }
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumofDigits fn = new SumofDigits();
        System.out.println("By using For Loop\nSum of Digits  upto "+n+" is "+fn.sumwithLoop(n)+"\n\n");
        System.out.println("By using For Formula\nSum of Digits  upto "+n+" is "+fn.sumwithFormula(n)+"\n\n");
        sc.close();
    }
}