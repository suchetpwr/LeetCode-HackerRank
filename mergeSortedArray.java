import java.util.Arrays;

public class mergeSortedArray {
    public static int[] mergeArray(int[] arr1, int[] arr2, int m, int n){
        int p = m+n-1;
        int p1 = m-1;
        int p2 = n-1;

        while(p1 >=0 && p2 >=0){
            if(arr1[p1]>arr2[p2]){
                arr1[p] = arr1[p1];
                p1--;
                p--;
            } else {
                arr1[p] = arr2[p2];
                p2--;
                p--;
            }
        }
        while (p2 >=0 ){
            arr1[p] = arr2[p2];
            p2--;
            p--;
        }
        return arr1;
    }
    public static void main(String []args){
        int[] arr1 = {10,20,30,0,0,0};
        int[] arr2 = {2,5,6};
        int arr1Size = 3;
        int arr2Size = arr2.length;
        System.out.println(Arrays.toString(mergeArray(arr1, arr2, arr1Size, arr2Size)));
    }
}
