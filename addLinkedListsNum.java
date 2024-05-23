import java.util.*;

public class addLinkedListsNum {
    private static int findSum(List<?> l1, List<?> l2){
        int num1 = 0;
        int num2 = 0;
        int offset1 = 1;
        int offset2 = 1;
        for(int i=0; i<l1.size(); i++){
            num1 = num1 + (int) l1.get(i)*offset1;
            offset1 = offset1*10;
        }
        System.out.println("num1 = "+num1);
        for(int j=0; j<l2.size(); j++){
            num2 = num2 + (int) l2.get(j)*offset2;
            offset2 = offset2*10;
        }
        System.out.println("num2 = "+num2);
        int finalSum = num1+num2;
        return finalSum;
    }
    public static void main(String []args){
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> results = new LinkedList<>();
        // LinkedList<Integer> sum = new LinkedList<>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        l2.add(9);
        int sum = findSum(l1, l2);
        while(sum !=0){
            results.add(sum%10);
            sum = sum/10;
        }
        System.out.println(results);
    }
    }
    