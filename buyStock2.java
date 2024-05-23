/* Link to problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/*/
public class buyStock2 {
private static int profit(int[] arr){
    int temp=0;
    for(int i=0; i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            temp = temp+(arr[i+1]-arr[i]);
        }
    }
    return temp;
}
public static void main(String []args){
    int arr[] = {1,2,3,4,5};
    System.out.println(profit(arr));
}    
}
