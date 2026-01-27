class FibonacciSeries{
    public static void main(String args[]){
        int n = 20;
        int i1 = 0, i2 = 1 ;
        System.out.print(i1+" "+i2+" ");
        for(int i=2;i<=20;i++){
            int sum = i1 + i2;
            System.out.print(sum+" ");
            i1 = i2;
            i2 = sum;
        }
    }
}