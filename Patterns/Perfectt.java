import java.util.*;
class Perfectt{
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            if(i>0){
                int k = i;
                 for(int j=0;j<k;j++){
                System.out.print("* ");
            }
            }
            System.out.println();
        }
        sc.close();
    }
}