/*Link to problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/878/*/

import java.util.HashMap;

public class romanToInteger {
private static int returnInteger(String str, HashMap map){
    int result = 0;
    String[] strArr = str.split("");
    for(int i = 0; i<=strArr.length-1; i++){
        if(i == strArr.length-1 && (int)map.get(strArr[i-2]) <= (int)map.get(strArr[i-1])){
            result = result + (int)map.get(strArr[i-1]);
            break;
        }
        if((int)map.get(strArr[i]) > (int)map.get(strArr[i+1])){
            result = result + (int)map.get(strArr[i]);
        }
        else if((int)map.get(strArr[i]) < (int)map.get(strArr[i+1])){
            result = result + (int)map.get(strArr[i+1]) - (int)map.get(strArr[i]);
            i++;
        }
        else{
            result = result + (int)map.get(strArr[i]);
        }
    }
    return result;
}
public static void main(String []args){
    String input = "MCMXCIV";
    HashMap<String, Integer> table = new HashMap<>();
    table.put("I", 1);
    table.put("V", 5);
    table.put("X", 10);
    table.put("L", 50);
    table.put("C", 100);
    table.put("D", 500);
    table.put("M", 1000);
    int result = returnInteger(input, table);
    System.out.println(" result = "+result);
}
}
