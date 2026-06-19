import java.util.*;
class Merge_Sort{

    public void print(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void merge(int arr[],int left,int mid,int right){
        int lSize = mid - left + 1;
        int rSize = right - mid;
        
        int[] leftArray = new int[lSize];
        int[] rightArray = new int[rSize];

        for(int i=0;i<lSize;i++){
            leftArray[i] = arr[left + i];
        }

        for(int j=0;j<rSize;j++){
            rightArray[j] = arr[mid+1+j];
        }

        int i=0,j=0,k=left;
        while(i < lSize && j < rSize){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < lSize){
            arr[k] = leftArray[i];
            i++;k++;
        }
        while(j < rSize){
            arr[k] = rightArray[j];
            j++;k++;
        }
    }

    public void mergeSort(int arr[], int left, int right){
        if(left < right){
            int mid = (left + right)/2;

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }

    public static void main(String mos[]){

        int arr[] = {7,12,9,11,3};
        int n = arr.length;

        Merge_Sort m1 = new Merge_Sort();

        System.out.println("Before Sorting");
        m1.print(n,arr);

        m1.mergeSort(arr,0,n-1);
        
        System.out.println("After Sorting");
        m1.print(n,arr);
    }
}