package leetcode;
/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/*/
import java.util.HashMap;

public class validAnagram {
private static boolean checkAnagram(String[] array, String[] testArray){
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    int count = 0;
    for(int i=0; i<array.length;i++){
        map.put(array[i], i);
    }
    for(int i=0;i<testArray.length;i++){
        if(!map.containsKey(testArray[i])){
            return false;
        }
    }
    return true;
}
public static void main(String []args){
    String anagramStr = "tomato";
    String anagramTest = "omatto";
    String[] strArray = anagramStr.split("");
    String[] testArray = anagramTest.split("");
    boolean result = checkAnagram(strArray, testArray);
    System.out.println(" "+result);
}
}
