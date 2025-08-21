import java.util.*;

class Palindrome{
    // Reverse of a String using String StringBuilder
    String SBuilder(String s){
        StringBuilder bf = new StringBuilder(s);
        bf.reverse();
        String ss = bf.toString();
        return ss;
    }
    // Reverse of a String using For Loop
    String Forloop(String s){
        int l = s.length();
        String ss = "";
        for(int i=l-1;i>=0;i--){
            ss = ss + s.charAt(i);
        }
        return ss;
    }

    // Function to Check whether the Original String and Reversed String are same
    static boolean check(String s, String ss){
        return s.equals(ss);
    }
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        Palindrome fn = new Palindrome();
        System.out.print("Reverse of String\nEnter 1 for using StringBuilder, 2 for using Forloop: ");
        int n = sc.nextInt();
        String ss = "";
        if(n==1) ss = fn.SBuilder(s);
        else ss = fn.Forloop(s);
        
        if(check(s,ss)) System.out.println("It's a Palindrome");
        else System.out.println("Not a Palindrome");
        sc.close();
    }
}