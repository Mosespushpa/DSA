import java.util.*;
class SeniorCitizen{
    public static void main(String mos[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for normal code ## Enter 1 for Optimized code: ");
        int n = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Gender 'm' or 'f': ");
        char gender = sc.next().charAt(0);
        gender = Character.toUpperCase(gender);
        if(n==0){
            if(gender == 'M' && age >= 60){
                System.out.println("SENIOR CITIZEN");
            }
            else if(gender == 'F' && age >= 58){
                System.out.println("SENIOR CITIZEN");
            }
            else{
                System.out.println("NOT A SENIOR CITIZEN");
            }
        }
        else{
            if((gender == 'M' && age >= 60) || (gender == 'F' && age >= 58)){
                System.out.println("SENIOR CITIZEN");
            }
            else{
                System.out.println("NOT A SENIOR CITIZEN");
            }
        }
        sc.close();


    }
}