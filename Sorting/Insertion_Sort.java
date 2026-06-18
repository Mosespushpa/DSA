import java.util.*;
class Insertion_Sort{

    public void print(int n, int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String mos[]){

        int arr[] = {7,12,9,11,3};
        int n = arr.length;

        Insertion_Sort s1 = new Insertion_Sort();

        System.out.println("Before Sorting");
        s1.print(n,arr);

        for(int i=1;i<n;i++){
           int j = i-1;
           int current_elem = arr[i];
           while(j>=0 && arr[j] > current_elem){
                arr[j+1] = arr[j];
                j = j-1;
           }
           arr[j+1] = current_elem;
        }
        System.out.println("After Sorting");
        s1.print(n,arr);
    }
}