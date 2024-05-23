import java.util.ArrayList;
import java.util.Arrays;

public class intersectionArrays {

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int size1 = arr1.length;
        int size2 = arr2.length;
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        if(size1>size2){
            for(int i=0; i<size1; i++){
                arrList.add(arr1[i]);
            }
            for(int j=0; j<size2; j++){
                if(arrList.contains(arr2[j]) && !results.contains(arr2[j])){
                    results.add(arr2[j]);
                }
            }
        }
        else {
            for(int i=0; i<size2; i++){
                arrList.add(arr2[i]);
            }
            for(int j=0; j<size1; j++){
                if(arrList.contains(arr1[j]) && !results.contains(arr1[j])){
                    results.add(arr1[j]);
                }
            }
        }
        int temp = results.size();
        int[] resultsArray = new int[temp];
        for(int i=0; i<temp;i++){
            resultsArray[i] = results.get(i);
        }
        return resultsArray;
    }
    public static void main(String []args){
        int[] array1 = {1,2,2,1};
        int[] array2 = {2,2};
        System.out.println(Arrays.toString(mergeArray(array1, array2)));
    }
}
