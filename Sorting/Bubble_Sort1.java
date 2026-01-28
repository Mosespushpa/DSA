import java.util.*;

class Bubble_Sort1{
    public static void main(String ar[]){
        int arr[] = {2,3,4,5,7,6,54,3,4,6,7};
        int n = arr.length;
        //Bubble Sort
       for(int i=0;i<n;i++){
        for(int j=0;j<n-1-i;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            } 
        }
        for(int k=0;k<n;k++){

            System.out.print(arr[k]+" ");
        }
        System.out.println();
       }
        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
        
    }
}