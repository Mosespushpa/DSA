class FibonacciSeriesRec{
    public  static int i = 2;
    public static void fib(int a,int b){
        if(i <= 14){
            int sum = a + b;
            System.out.print(sum+"  ");
            i++;
            a = b;
            b = sum;
            fib(a,b);
        }

    }
    public static void main(String args[]){
       
        System.out.print(0+" "+1+" ");
        fib(0,1);


        
    }
}