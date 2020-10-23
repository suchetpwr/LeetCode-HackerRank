package leetcode;

/*Link to problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/*/
import java.util.HashMap;

public class twoSum {
private static int[] returnArraySum(int[] arr, int target){
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<arr.length;i++){
        map.put(arr[i], i);
    }
    for(int i=0; i<arr.length;i++){
        if(map.containsKey(target-arr[i])){
            result[0] = map.get(target-arr[i]);
            result[1] = i;
        }
    }
    return result;
}
public static void main(String []args){
    int[] arr = {2,11,16,7};
    int target = 9;
    int[] result = new int[2];
    result = returnArraySum(arr, target);
    for(int i=0;i<result.length;i++){
        System.out.print(" "+result[i]);
    }
}
}
