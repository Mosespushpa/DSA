import java.util.*;

class Patterns{
    //Star Matrix
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    void Matrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Number Pattern - 1
    // 1 1 1 1 1
    // 2 2 2 2 2
    // 3 3 3 3 3
    // 4 4 4 4 4
    // 5 5 5 5 5
    void N1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Number Pattern - 2
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    void N2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Number Pattern - 3
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5
    void N3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Number Pattern - 4
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    void N4(int n){
        int c = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
        System.out.println();
    }
    //Number Pattern  - 5
    // 1
    // 1 2
    // 3 5 8
    // 13 21 34 55
    // 89 144 233 377 610
    void N5(int n){
        int a = 1;
        int b = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = a+b;
                System.out.print((a+b)+" ");
                a = b;
                b = sum;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String mos[]){
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        Patterns fn = new Patterns();
        System.out.println("Star Matrix");
        fn.Matrix(n);
        System.out.println("Number Pattern - 1");
        fn.N1(n);
        System.out.println("Number Pattern - 2");
        fn.N2(n);
        System.out.println("Number Pattern - 3");
        fn.N3(n);
        System.out.println("Number Pattern - 4");
        fn.N4(n);
        System.out.println("Number Pattern - 5");
        fn.N5(n);
        
        sc.close();

    }
}