import java.util.*;

class Selection_Sort{
    public static void main(String ar[]){
        int arr[] = {3,4,5,7,6,3,2};
        int n = arr.length;
        //Selection Sort - 29-01-2026
        for(int i=0;i<n;i++){
            int id = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[id]){
                    id = j;
                }
            }
            int temp = arr[id];
            arr[id] = arr[i];
            arr[i] = temp;
        }

        // for(int i=0;i<n;i++){
        //     int minId = i;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j] < arr[minId]){
        //             minId = j;
        //           }
        //     }
        //     int temp = arr[minId];
        //             arr[minId] = arr[i];
        //             arr[i] = temp;  

        // }
        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
        
    }
}