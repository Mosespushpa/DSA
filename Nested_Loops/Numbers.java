import java.util.*;
class Numbers {
    public static void main(String mos[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            if(i%2 != 0){
               for(int j=1;j<=r;j++){
                System.out.print(j+" ");
            } 
            }
            else{
                for(int j=10;j>=1;j--){
                System.out.print(j+" ");
                }
            }
            System.out.println();
        }

    }
}

