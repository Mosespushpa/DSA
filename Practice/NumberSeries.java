import java.util.*;

class NumberSeries{
    // Multiple of two
    void X2(int n){
        System.out.print(1+" ");
        for(int i=2;i<=n;i++){
            System.out.print(i*2+" ");
        }
        System.out.println();
    }
    // no multiples of 4 and even position must be negative
    void NOmuliplesOf4(int n){
        int c = 1;
        for(int i=1;i<=n;i++){
            if(i%4 == 0) continue;
            if(c%2 == 0) System.out.print(-i+" ");
            else
                System.out.print(i+" ");
            c++;
        }
        System.out.println();
    }
    // N power N
    void NpowerN(int n){
        for(int i=1;i<=n;i++){
            System.out.print((int)Math.pow(i,i)+" ");
        }
        System.out.println();
    }
    // N Square
    void Squares(int n){
        for(int i=1;i<=n;i++){
            System.out.print((int)Math.pow(i,2)+" ");
        }
        System.out.println();
    }
    // Fibnocci Series
    void Fibnocci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            int sum = a+b;
            System.out.print(sum+" ");
            a = b;
            b = sum;
        }
    }
    // Alternative Plus 3
    void Alternative(int n){
        int a = 1;
        int b = 2;
        System.out.print(a+" "+(-b)+" ");
        for(int i=1;i<=n-2;i++){
            if(i%2 != 0){
                a = a+3;
                System.out.print((a)+" ");
                
            }
            else{
                b = b + 4;
                System.out.print((-(b))+" ");
            }
        }
    }
    
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NumberSeries fn = new NumberSeries();
        System.out.println("\n\nMultiple of Two");
         fn.X2(n);
        System.out.println("\n\nNO Multiple of four");
        fn.NOmuliplesOf4(n);
        System.out.println("\n\nNpowerN");
        fn.NpowerN(n);
        System.out.println("\n\nSquares");
        fn.Squares(n);
        System.out.println("\n\nFibnocci Series");
        fn.Fibnocci(n);
        System.out.println("\n\nMultiple of Two");
        fn.Alternative(n);
        sc.close();
    }
}