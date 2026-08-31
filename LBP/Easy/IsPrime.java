
public class IsPrime {
    public static void main(String ar[]){
        Input in = new Input();

        System.out.println("Enter a number to check whether it is Prime or not");
        int n = in.sc.nextInt();

        if(n == 1 || n == 0){
            System.out.println("Not a Prime");
            return;
        }
        if(n == 2){
            System.out.println("Is Prime");
            return;
        }
        for(int i=2;i<n-1;i++){
            if(n%i == 0){
                System.out.println("Not a Prime");
                return;
            }
        }
        for(int i=2;i*i<n-1;i++){
            if(n%i == 0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Is Prime");
    }
}
