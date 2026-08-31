
import util.Input;
public class ReverseOfDigits{
    public static void main(String ar[]){
        Input in = new Input();

        System.out.println("Enter the Number to Reverse The digits");
        int n = in.sc.nextInt();

        System.out.println("Choose the method\n1. for Digit Extraction\n2. for String Coversion");
        int op = in.sc.nextInt();

        ReverseOfDigits sd = new ReverseOfDigits();
        switch(op){
            case 1:
                sd.digit(n);
                break;
            case 2:
                sd.string(n);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }


        
    }
    void digit(int n){
        int number = 0;
        while(n > 0){
            number = (number * 10) + (n%10);
            n = n /10;
        }
        System.out.println("Number "+n+" Reverse of digits: "+number);
    }
    void string(int n){
       String s = Integer.toString(n);
       String ss = "";
       for(int i=s.length()-1;i>=0;i--){
        ss = ss + s.charAt(i);
       }
       int sum = Integer.parseInt(ss);
        System.out.println("Number "+n+" Sum of digits: "+sum);
    }
}