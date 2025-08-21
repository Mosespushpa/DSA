import java.util.*;

class SumofEven{
    // Using Loops to Calculate sum of even numbers
    int sumwithLoop(int n){
        int sum1 = 0;
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                sum1 = sum1 + i;
            }
        }
        return sum1;
    }
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumofEven fn = new SumofEven();
        System.out.println("By using For Loop\nSum of even numbers upto "+n+" is "+fn.sumwithLoop(n)+"\n\n");
        sc.close();
    }
}