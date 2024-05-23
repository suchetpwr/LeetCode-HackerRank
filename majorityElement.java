import java.util.*;

public class majorityElement {
    
    public static void findMajor(int[] arr){
        int mid = arr.length/2;
        int counter = 0;
        int result = 0;
        Arrays.sort(arr);
        int temp = arr[0];
        System.out.println("Arr[0] = "+arr[0]);
        System.out.println("Temp at beginning = "+temp);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == temp){
                System.out.println("temp is matching array value");
                counter++;
            }
            else if(counter > mid){
                result = arr[i];
            }
            else {
                counter = 1;
                temp = arr[i];
                System.out.println("Temp changing to = "+temp);
            }
            //System.out.print(" "+arr[i]);
        }
        System.out.println("result = "+result);
    }
    public static void main(String []args){
       int[] arr = {3,2,3};
       findMajor(arr);
    }
}
