import java.util.*;
class Selection_Sort{

    public void print(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String mos[]){

        int arr[] = {7,12,9,11,3};
        int n = arr.length;

        Selection_Sort s1 = new Selection_Sort();

        System.out.println("Before Sorting");
        s1.print(n,arr);

        for(int i=0;i<n;i++){
            int min_Index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_Index]){
                    min_Index = j;
                }
            }
            int temp = arr[i];
            arr[i]  = arr[min_Index];
            arr[min_Index] = temp;
        }
        System.out.println("After Sorting");
        s1.print(n,arr);
    }
}