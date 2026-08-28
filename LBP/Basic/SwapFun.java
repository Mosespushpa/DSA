import java.util.*;
class SwapFun{
    public void xor(int a,int b){
        System.out.println("Before Swapping \nA: "+a+"\nB: "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping \nA: "+a+"\nB: "+b);
    }
    public void arithematic(int a,int b){
        System.out.println("Before Swapping \nA: "+a+"\nB: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping \nA: "+a+"\nB: "+b);
    }
    public void thridVar(int a,int b){
        System.out.println("Before Swapping \nA: "+a+"\nB: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping \nA: "+a+"\nB: "+b);
    }
}