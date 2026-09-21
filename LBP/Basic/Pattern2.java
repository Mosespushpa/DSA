public class Pattern2 {
    public static void main(String ar[]){
        Input in = new Input();

        System.out.print("Enter N value: ");
        int n = in.sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
