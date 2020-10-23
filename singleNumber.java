package leetcode;
/* Link for problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/*/
import java.util.Arrays;

public class singleNumber {
public static void main(String args[]){
    int[] arr = {4,1,2,1,2};
    int len = arr.length;
    Arrays.sort(arr);
    for(int i=0; i<=len-1;i++){
        if(i==len-1){
            System.out.println(arr[i]);
            break;
        }
        if(arr[i] == arr[i+1]){
            if(i == len-1){
                System.out.println(arr[i]);
            }
            else{
                i++;
            }
        }
        else {
            System.out.println(arr[i]);
            break;
        }
            
    }
}
}
