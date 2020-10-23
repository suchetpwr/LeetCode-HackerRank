package leetcode;
/*Link to problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/*/

import java.util.ArrayList;

public class fuzzBizz {
private static ArrayList<String> fizzBuzz(int n){
    ArrayList<String> result = new ArrayList<>();
    for(int i=1; i<=n; i++){
        if(i%3==0){
            if(i%5==0){
                result.add("FizzBuzz");
            }
            else{
                result.add("Fizz");
            }
        }
        else if(i%5==0){
            result.add("Buzz");
        }
        else{
            result.add(Integer.toString(i));
        }
    }
    return result;
}
public static void main(String []args){
    ArrayList<String> result = new ArrayList<>();
    int n = 15;
    result = fizzBuzz(n);
    System.out.println(result);
}
}
