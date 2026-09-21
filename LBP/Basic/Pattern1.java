public class Pattern1 {
    public static void main(String ar[]){
        Input in = new Input();

        System.out.print("Enter N value: ");
        int n = in.sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
