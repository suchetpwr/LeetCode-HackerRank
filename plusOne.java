package leetcode;

/*Link to problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/*/

public class plusOne {
private static int[] returnArray(int resultNumber, String str){
    int[] tempResultArray = new int[str.length()];
    String tempString = Integer.toString(resultNumber);
    String[] stringArray = tempString.split("");
    for(int i=0; i<tempResultArray.length;i++){
        tempResultArray[i] = Integer.parseInt(stringArray[i]);
    }
    return tempResultArray;
}
private static int returnNumber(String numberString){
    int number = Integer.parseInt(numberString);
    number += 1;
    return number;
}
private static int[] calculatePlusOne(int[] arr){
    String str = "";
    int resultNumber;
    for(int i = 0; i<arr.length;i++){
        str = str + arr[i];
    }
    System.out.println(" "+str);
    resultNumber = returnNumber(str);
    String stringToNumber = String.valueOf(resultNumber);
    int stringToNumberLen = stringToNumber.length();
    if(stringToNumberLen > str.length()){
        int[] resultArray = new int[str.length()+1];
        resultArray =  returnArray(resultNumber, str+1);
        return resultArray;
    }
    else{
        int[] resultArray = new int[str.length()];
        resultArray =  returnArray(resultNumber, str);
        return resultArray;
    }

}
public static void main(String args[]){
    int[] arr = {9,9,9,9,9};
    int[] finalArray = calculatePlusOne(arr);
    for(int i=0;i<finalArray.length;i++){
        System.out.print(" "+finalArray[i]);
    }
}
}
