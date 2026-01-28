import java.util.*;

class Insertion_Sort{
    public static void main(String ar[]){
        int arr[] = {3,4,5,7,6,3,2};
        int n = arr.length;
        //Bubble Sort
        for(int i=1;i<n;i++){
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;

        }
        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
        
    }
}