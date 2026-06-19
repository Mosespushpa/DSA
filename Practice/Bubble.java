class Bubble{

    public void print(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String mos[]){

        int arr[] = {7,12,9,11,3};
        int n = arr.length;
        
        Bubble b = new Bubble();
        System.out.println("Bubble Sort Algorithm");
        System.out.println("Before Sorting");
        b.print(n,arr);

        for(int i=0;i<n;i++){
            boolean Swaped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    Swaped  = true;
                }
            }
            if(!Swaped) break;
        }
        System.out.println("After Sorting");
        b.print(n,arr);

    }
}