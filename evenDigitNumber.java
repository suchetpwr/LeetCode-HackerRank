public class evenDigitNumber {
    public static int getEvenNumber(int[] arr){
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            int didgitCounter = 0;
            int temp = arr[i];
            while(temp != 0){
                // System.out.println("temp = "+temp);
                temp = temp/10;
                // System.out.println("counter = "+counter);
                didgitCounter ++;
            }
            if(didgitCounter%2 == 0){
                counter++;
            }
        }
        return counter;
    }

public static void main(String []args){
    int[] num = {23, 353, 576235, 354, 28736, 123, 973, 77, 88009977};
    System.out.println(getEvenNumber(num));
}
}
