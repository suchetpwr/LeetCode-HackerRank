import java.util.*;

public class mergeLists {
    public static void main(String []args){
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        int bigSize;
        int pointer = 0;
        l1.add(1);
        l1.add(3);
        // l1.add(5);
        // l1.add(7);
        // l1.add(9);
        l2.add(4);
        // l2.add(4);
        // l2.add(6);
        // l2.add(8);
        if(l1.get(0) > l2.get(0)){
            bigSize = l2.size();
        }
        for(int i=0; i<l2.size(); i++){
            if(l1.get(pointer) > l2.get(i)){
                l2.add(i+1, l1.get(pointer));
                pointer++;
            }
            }
            /* if(l1.get(0) < l2.get(0)){
                l1.add(0, l2.get(0)); 
            } */
        System.out.println(l1);
    }
    }
    