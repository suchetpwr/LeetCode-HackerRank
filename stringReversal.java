/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/*/
public class stringReversal {
private static String[] reverseString(String[] array){
    for(int i=0, j=array.length-1;i<=(array.length/2) && j>=(array.length/2);i++,j--){
            String temp = "";
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }
    /*for(int i=0;i<array.length;i++){
        System.out.print(" "+array[i]);
    }*/
    return array;
}
public static void main(String args[]){
    String[] array = {"H","e","l","l","o"};
    String[] result = new String[array.length];
    result = reverseString(array);
    for(int i=0;i<result.length;i++){
        System.out.print(" "+result[i]);
    }
}
}
