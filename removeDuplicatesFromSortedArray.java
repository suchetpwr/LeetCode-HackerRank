public class removeDuplicatesFromSortedArray {
    
    public static void removeDuplicates(int[] arr){
        int ptr = arr[0];
        int counter = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ptr){
                //System.out.println(arr[i]);
                continue;
            }
            else if(arr[i] != ptr){
                //System.out.println(arr[i]);
                ptr = arr[i];
                arr[counter] = arr[i];
                counter++;
            }
        }
        for(int j=0; j<counter; j++){
            System.out.println("Array value = "+arr[j]);
        }
    }
    public static void main(String []args){
       int[] arr = {0,0,1,1,1,2,2,3,3,4};
       removeDuplicates(arr);
    }
}
