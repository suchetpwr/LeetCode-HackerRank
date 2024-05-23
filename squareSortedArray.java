import java.util.Arrays;

public class squareSortedArray {
    public static int[] getSquareArray(int[] arr){
        int size = arr.length;
        int [] results = new int[size];
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            int tempRes = temp*temp;
            results[i] = tempRes;
            if(i == 0){
                results[i] = tempRes;
            }
            else{
                if(results[i-1] < tempRes){
                    results[i] = tempRes;
                } 
                else{
                    for(int j = i-1; j>=0; j--){
                        if(results[j] > tempRes){
                            results[j+1] = results[j];
                            results[j] = tempRes;
                        }
                    }
                }   
        }
        }
        return results;
    }
    public static void main(String []args){
        int[] array = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(getSquareArray(array)));
    }    
}
