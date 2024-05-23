/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/*/

public class validPalindrom {
private static boolean checkValidity(String[] arr){
    for(int i=0, j=arr.length-1; i<arr.length/2 && j>arr.length/2; i++, j--){
        if(!arr[i].equals(arr[j])){
            System.out.print(" "+arr[i]);
            System.out.print(" "+arr[j]);
            return false;
        }
    }
    return true;
}
public static void main(String []args){
    String str = "naman :   naman ";
    String newString = str.replaceAll("[0-9,:';]*", "").replaceAll(" ", "").toLowerCase();
    String[] strArray = newString.split("");
    /*for(int i=0;i<strArray.length;i++){
        System.out.print(" "+strArray[i]);
    }*/
    boolean result = checkValidity(strArray);
    System.out.print(result);
    System.out.print(" "+strArray.length);
}
}
