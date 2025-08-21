import java.util.*;

class DigittoWords{
    // Converting Digit in words
    String Convert(String n){
        String ans = "";
        int l = n.length();
        for(int i = 0;i<l;i++){
            char digit = n.charAt(i);
            switch(digit){
                case '0':
                    ans = ans + "Zero ";
                    break;
                case '1':
                    ans = ans + "One ";
                    break;
                case '2':
                    ans = ans + "Two ";
                    break;
                case '3':
                    ans = ans + "Three ";
                    break;
                case '4':
                    ans = ans + "Four ";
                    break;
                case '5':
                    ans = ans + "Five ";
                    break;
                case '6':
                    ans = ans + "Sixe ";
                    break;
                case '7':
                    ans = ans + "Seven ";
                    break;
                case '8':
                    ans = ans + "Eight ";
                    break;
                case '9':
                    ans = ans + "Nine ";
                    break; 
                
            }
        }
        return ans;
    }
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        DigittoWords fn = new DigittoWords();
        System.out.println(n+" in Words: "+fn.Convert(n));
        sc.close();
    }
}