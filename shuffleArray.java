package leetcode;
/*Link to problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/*/

public class shuffleArray {
public static int[] shuffel(int[] copy){
    int i=0;
    int swap = i + (int)(Math.random()*(((copy.length)-i)+1));
    for(i=0; i<copy.length;i++){
        int temp = copy[swap];
        copy[swap] = copy[i];
        copy[i] = temp;
    }
    return copy;
}
public static int[] reset(int[] array){
    return array;
}
public static int[] solution(int[] array){
    int[] copy = array.clone();
    
    int[] resultReset = reset(array);
    int[] resultShuffel = shuffel(copy);
    for(int i=0; i<resultReset.length;i++){
        System.out.print(" "+resultReset[i]);
    }
    System.out.println(" ");
    for(int i=0; i<resultShuffel.length;i++){
        System.out.print(" "+resultShuffel[i]);
    }
    return array;
}
public static void main(String []args){
    int[] array = {5,15,25};
    shuffleArray sf = new shuffleArray();
    sf.solution(array);
}
}
