import java.util.*;

public class reverseNodes {
    private static void findSum(List<?> l1, int k){
        int temp = 0;
        for(int i=0; i<l1.size(); i++){
            temp = i+k-1;
            if(temp > l1.size()){
                break;
            }
            List sub = l1.subList(i, temp);
            for (int j = i; j<k; j++) {
                Collections.swap(sub, i, k);
            }
        }
        System.out.println(l1);
    }
    public static void main(String []args){
        LinkedList<Integer> l1 = new LinkedList<>();
        int k = 2;
        // LinkedList<Integer> sum = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        findSum(l1, k);
    }
}
    