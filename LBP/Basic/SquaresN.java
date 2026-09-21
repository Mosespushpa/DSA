class SquaresN{
    public static void main(String ar[]){
        Input in = new Input();

        System.out.println("Printing Square upto N number");
        System.out.print("Enter the number: ");
        int n = in.sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print((i*i)+" ");
        }
    }
}