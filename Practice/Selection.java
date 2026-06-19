class Selection{

    public void print(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String mos[]){

        int arr[] = {7,12,9,11,3};
        int n = arr.length;
        
        Selection s = new Selection();
        System.out.println("Selection Sort Algorithm");
        System.out.println("Before Sorting");
        s.print(n,arr);

        for(int i=0;i<n;i++){
           int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Sorting");
        s.print(n,arr);

    }
}