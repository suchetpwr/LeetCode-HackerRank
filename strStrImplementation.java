/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/*/

public class strStrImplementation {
private static int strStr(String str, String pattern){
    String[] strArray = str.split("");
    String[] patternArray = pattern.split("");
    int stringLen = strArray.length;
    int patLen = patternArray.length;
    int temp = -1;
    int counter = 0; 
    if(pattern.length() == 0){
        return temp=0;
    }
    for(int i=0; i<stringLen;i++){
        for(int j=0; j<patLen;j++){
            System.out.println("In first for loop i,j = "+i+","+j);
            if(!patternArray[j].equals(strArray[i])){
                System.out.println("I = "+strArray[i]);
                System.out.println("J = "+patternArray[j]);
                break;
            }
            else{
                counter++;
            }
        }
        if(counter == pattern.length()){
                return temp = i;
            }
    }
    return temp;
}
public static void main(String []args){
    String str = "hello";
    String needel = "ll";
    int location = strStr(str, needel);
    System.out.println("location = "+location);
}
}
