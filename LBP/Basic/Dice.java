public class Dice {
    public static void main(String ar[]){
        Input input = new Input();
            System.out.println("Enter the number between 1 - 6: ");
            int n = input.sc.nextInt();
            if(n < 1 || n > 6){
                System.out.println("Invlaid number");
                return;
            }
            else{
                DiceFun df = new DiceFun();
                System.out.println("Choose \n1. for conditional\n2. for sum");
                int choose = input.sc.nextInt();
                df.conditional(n);
            }


        
    }
}
class DiceFun{
    public void conditional(int n ){
        if(n == 1){
            System.out.println("The opposite nunber for "+n+" is "+6);
        }
        else if(n == 2){
            System.out.println("The opposite nunber for "+n+" is "+5);
        }
        else if(n == 3){
            System.out.println("The opposite nunber for "+n+" is "+4);
        }
        else if(n == 4){
            System.out.println("The opposite nunber for "+n+" is "+3);
        }
        else if(n == 5){
            System.out.println("The opposite nunber for "+n+" is "+2);
        }
        else{
            System.out.println("The opposite nunber for "+n+" is "+1);
        }
    }
    public void sum(int n){
        int op = 7 - n;
        System.out.println("The opposite nunber for "+n+" is "+op);

    }
}
