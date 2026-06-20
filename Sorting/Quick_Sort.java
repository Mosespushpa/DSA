import java.util.*;
class Quick_Sort{

    public void print(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int pivot(int arr[],int left,int right){
        int i = left;
        int j = right;
        int pi = arr[left];
        while(i<j){
            while(arr[i] <= pi && i <= right-1){
                i++;
            }
            while(arr[j] > pi && j >= left+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
        }
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        return j;
    }

    public void quickSort(int arr[], int left, int right){
        if(left < right){
            
            int pIndex = pivot(arr,left,right);

            quickSort(arr,left,pIndex-1);
            quickSort(arr,pIndex+1,right);

          
        }
    }

    public static void main(String mos[]){

        int arr[] = {7,12,9,11,3};
        int n = arr.length;

        Quick_Sort q1 = new Quick_Sort();

        System.out.println("Before Sorting");
        q1.print(n,arr);

        q1.quickSort(arr,0,n-1);
        
        System.out.println("After Sorting");
        q1.print(n,arr);
    }
}