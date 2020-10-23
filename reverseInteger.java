package leetcode;
/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/*/
import java.util.Arrays;

public class reverseInteger {
private static char[] returnNumber(char[] array){
    if(array[0] != '-'){
        for(int i=0, j=array.length-1;i<=array.length/2 && j>=array.length/2;i++,j--){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    else {
        array[0] = '-';
        for(int i=1, j=array.length-1;i<=array.length/2 && j>=array.length/2;i++,j--){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    for(int i=0; i<array.length;i++){
        System.out.print(" "+array[i]);
    }
    return array;
}
public static void main(String []args){
    int number = -123;
    String temp = String.valueOf(number);
    System.out.println(" Converted String is "+temp);
    char[] stringArray = temp.toCharArray();
    for(int i=0; i<stringArray.length;i++){
        System.out.println("Converted array is = "+stringArray[i]);
    }
    stringArray = returnNumber(stringArray);
    String result = Arrays.toString(stringArray);
    Integer reversedNumber = Integer.parseInt(result);
    //System.out.println(" "+reversedNumber);
}
}
