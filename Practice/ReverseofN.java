import java.util.*;

class ReverseofN{
    // Reverse of N
    String reverseofN(int n){
        if (n==0) return "0";
        if (n < 10 && n > 0 ) return String.valueOf(n);
        String r = "";
        while(n > 0){
            int rem = n % 10;
            r = r + String.valueOf(rem);
            n = n/10;
        }
        return r;
    }
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseofN fn = new ReverseofN();
        System.out.println("Reverse of "+n+" is "+fn.reverseofN(n));
        sc.close();
    }
}