/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/*/

public class stringToIntegerATOI {
private static int returnNumber(String num){
    int temp = 0;
    if("1".equals(num)){
        temp = 1;
    }
    else if("2".equals(num)){
        temp = 2;
    }
    else if("3".equals(num)){
        temp = 3;
    }
    else if("4".equals(num)){
        temp = 4;
    }
    else if("5".equals(num)){
        temp = 5;
    }
    else if("6".equals(num)){
        temp = 6;
    }
    else if("7".equals(num)){
        temp = 7;
    }
    else if("8".equals(num)){
        temp = 8;
    }
    else if("9".equals(num)){
        temp = 9;
    }
    else if("0".equals(num)){
        temp = 0;
    }
    return temp;
}
private static boolean checkIfNumber(String num){
    if(!("0".equals(num) || "1".equals(num) || "2".equals(num) || "3".equals(num) || "4".equals(num) || "5".equals(num) || "6".equals(num) || "7".equals(num) || "8".equals(num) || "9".equals(num) || "-".equals(num) || "+".equals(num))){
        return true;
    }
    else
        return false;
}
private static int convertToInt(String[] arr){
    int result = 0;
    int maxVal = 2147483647;
    int minVal = -2147483648;
    for(int i=0;i<arr.length;i++){
        if(checkIfNumber(arr[0])){
            //System.out.println("In the checking area if the string starts without a number");
            return 0;
        }
        if("-".equals(arr[0])){
            if(i == 1){
            result = returnNumber(arr[i]);
            //System.out.println("in the minus sign checker if");
            }
            else{
            if(checkIfNumber(arr[i])){
                return 0-result;
            }
            result = result*10;
            //System.out.println("number after first iteration in negative number checker if = "+result);
            result = result + returnNumber(arr[i]);
            //System.out.println("result = "+result);
            if(i == arr.length-1){
                result = 0 - result;
                return result;
            }
            }
        }
        else{
            if(checkIfNumber(arr[i])){
                return result;
            }
            if(i == 0){
            result = returnNumber(arr[i]);
            //System.out.println("in the positive number else");
            }
            else{
            result = result*10;
            result = result + returnNumber(arr[i]);
            }
        }
    }
    if(result > maxVal){
        return maxVal;
    }
    else if(result < minVal){
        return minVal;
    }
    else{
        return result;
    }
}
public static void main(String args[]){
    String str = "-87".replaceAll(" ", "");
    //System.out.println(" After removing white spaces = "+str);
    String[] array = str.split("");
    int result = convertToInt(array);
    System.out.println(" result = "+result);
}
}
