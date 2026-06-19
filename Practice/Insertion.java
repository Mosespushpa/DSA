class Insertion{

    public void print(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String mos[]){

        int arr[] = {7,12,9,11,3};
        int n = arr.length;
        
        Insertion in = new Insertion();
        System.out.println("Insertion Sort Algorithm");
        System.out.println("Before Sorting");
        in.print(n,arr);

        for(int i=1;i<n;i++){
            int j = i-1;
            int current_ele = arr[i];
            while(j>=0 && current_ele < arr[j]){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = current_ele; 
        }
        System.out.println("After Sorting");
        in.print(n,arr);

    }
}