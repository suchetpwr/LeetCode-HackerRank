/*Link to problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/*/

public class primeNumbers {
private static int findPrimes(int n){
    int count = 0;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            count++;
            //System.out.println(" "+i);
        }
    }
    return count;
} 
public static void main(String []args){
    int n = 50;
    int result = findPrimes(n);
    System.out.println("result = "+result);
}
}
