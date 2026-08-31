
import util.Input;
public class SumOfDigits{
    public static void main(String ar[]){
        Input in = new Input();

        System.out.println("Enter the Number to find the Sum of digits");
        int n = in.sc.nextInt();

        System.out.println("Choose the method\n 1. for Digit Extraction\n2. for Recursion\n3. for String Coversion");
        int op = in.sc.nextInt();

        SumOfDigits sd = new SumOfDigits();
        switch(op){
            case 1:
                sd.digit(n);
                break;
            case 2:
                int sum = sd.recursion(n);
                System.out.println("Number "+n+" Sum of digits: "+sum);
                break;
            case 3:
                sd.string(n);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }


        
    }
    void digit(int n){
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int d = temp % 10;
            temp = temp /10;
            sum = sum + d;
        }
        System.out.println("Number "+n+" Sum of digits: "+sum);
    }
    int recursion(int n){
        if (n <= 0) return 0;
        else
            return (n%10) + recursion(n/10);
       
    }
    void string(int n){
       String s = Integer.toString(n);
       int sum = 0;
       for(int i=0;i<s.length();i++){
        sum = sum + s.charAt(i) - '0';
       }
       
        System.out.println("Number "+n+" Sum of digits: "+sum);
    }
}