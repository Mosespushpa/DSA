import java.util.*;
class Swap{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Swapping Two Numbers");
        System.out.println("Type number A: ");
        int a = sc.nextInt();
        
        System.out.println("Type number B: ");
        int b = sc.nextInt();

        SwapFun s = new SwapFun();
        System.out.println("Enter \n1. using thrid variable \n2. using arithematic \n3. using XOR operation");
        int n = sc.nextInt();
        switch(n){
            case 1:
                s.thridVar(a, b);
                break;
            case 2:
                s.arithematic(a,b);
                break;
            case 3:
                s.xor(a,b);
                break;
            default:
                System.out.println("Invalid Statment");
                break;
        }
    }
}