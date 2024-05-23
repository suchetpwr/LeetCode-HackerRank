import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class zeroDuplicate {
    public static int[] duplicateZero(int[] arr){
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<arr.length; i++){
            q.add(arr[i]);
        }
        System.out.println(q);
        for(int j=0; j<arr.length; j++){
            if(q.peek() != 0){
                arr[j] = q.peek();
                q.remove();
            }
            else {
                arr[j] = q.peek();
                if(j<arr.length-1){
                    arr[j+1] = q.peek();
                }
                j++;
                q.remove();
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int arr[] = {0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(duplicateZero(arr)));
    }
}
