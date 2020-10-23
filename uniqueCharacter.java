package leetcode;

/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/*/
import java.util.HashMap;
import java.util.Map;

public class uniqueCharacter {
private static int returnCharacter(String[] array){
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    int temp = 0;
    int result = 0;
    for(String tempStr : array){
        if(!map.containsKey(tempStr)){
            map.put(tempStr, temp);
        }
        else{
            map.put(tempStr, map.get(tempStr)+1);
        }
    }
    for(int i=0; i<array.length;i++){
        if(map.containsKey(array[i])){
            if(map.get(array[i]) == 0){
                result = i;
                //System.out.println("Inside the loop ");
                //System.out.println("result = "+result);
                break;
            }
        }
    }
    //System.out.println(" "+result);
    
    return result;

}
public static void main(String args[]){
    String str = "loveleetcode";
    String[] arrayStr = str.split("");
    int result = 0;
    /*for(int i=0;i<arrayStr.length;i++){
        System.out.print(" ,"+arrayStr[i]);
    }*/
    //System.out.println("");
    result = returnCharacter(arrayStr);
    System.out.println(""+result);
}
}
