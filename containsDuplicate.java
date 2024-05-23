public class containsDuplicate {
    public static int dupliacteReturn(int arr[]){
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            temp ^= arr[i];
        }
        return temp;        
    }
    public static void main(String []args){
        int[] arr = {1,5,2,4,2,4,1};
        System.out.println(dupliacteReturn(arr));
    }
}
