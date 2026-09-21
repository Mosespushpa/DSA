public class IsPrime {
    public static void main(String ar[]){
        int maxn = 1000000+1;
        boolean arr[] = new boolean[maxn];
        arr[0] = false;arr[1] = false;arr[2] = true;arr[3] = true;arr[4] = false;arr[5] = true;arr[6]=false;arr[7] = true;arr[11] = true;
        for(int i=8;i<maxn;i++){
            if(i%2!=0 && i%3 != 0 && i%5!=0 && i%7 != 0 && i%11!=0){
                arr[i] = true;
            }
        } 
        int c = 0;
        for(int i=1;i<maxn;i++){
            if(arr[i]){
                // System.out.print(i+" ");
                c++;
            }
        }
        System.out.println(c);
    }
}
