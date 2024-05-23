/* Link to roblem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/*/ 
public class moveZero {
public static void main(String []args){
    int[] arr = {0,1,0,3,0,2,0,0,0,12,0};
    for(int i=0;i<arr.length;i++){
        if(arr[i] == 0){
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] != 0){
                    arr[i] = arr[j];
                    arr[j] = 0;
                    break;
                }
            }
        }
    }
    for(int i=0; i<arr.length;i++){
        System.out.print(" "+arr[i]);
    }
}    
}
