
public class NumberGuessing {
    public static void main(String ar[]){
        Input in = new Input();
        int rn = (int)(100 * Math.random());
        // System.out.println(rn);

        System.out.print("In how many attempts can you guess the number: ");
        int at = in.sc.nextInt();

        for(int i=0;i<at;i++){
            System.out.println("Attempt no. "+(i+1));
            System.out.print("Guess the number: ");
            int n = in.sc.nextInt();
            if( n == rn){
                System.out.println("!! You have Guessed it Right");
                return;
            }
            else if(n > rn){
                System.out.println("Less than "+n);
            }
            else{
                System.out.println("Greater than "+n);
            }
        }
        System.out.println("Try again!!!");
    }
}
