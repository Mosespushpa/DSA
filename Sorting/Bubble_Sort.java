class Bubble_Sort{

    public void print(int n, int[] arr){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String mos[]){
        Bubble1 b1 = new Bubble1();

        int arr[] = {7,12,9,11,3};
        int n = arr.length;
        System.out.println("Before Sorting:");
        //printing of the array
        b1.print(n,arr);
        //Bubble sort
        for(int i=0;i<n;i++){
            boolean isswap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isswap = true;
                }
            }
            System.out.print("Pass " + (i+1) + ": ");
            b1.print(n, arr);

            if(!isswap) break;
        }
        
        System.out.println("After Sorting");
        //printing of the array
        b1.print(n,arr);

    }
}