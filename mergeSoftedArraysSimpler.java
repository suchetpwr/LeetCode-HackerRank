/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/*/
public class mergeSoftedArraysSimpler {
public static void main(String []args){
    int[] arr1 = {1,2,5,6,0,0,0};
    int[] arr2 = {2,5,7};
    int temp = 0;
    for(int i=0;i<arr1.length;i++){
        if(arr1[i] == 0 && i != 0){
            arr1[i] = arr2[temp];
            temp++;
        }
    }
    /*for(int j=0; j<arr1.length;j++){
        System.out.println(" "+arr1[j]);
    }*/
    for(int j=0; j<arr1.length-1;j++){
        if(arr1[j] > arr1[j+1]){
            for(int k=j+1; k>0; k--){
                if(arr1[k] < arr1[k-1]){
                    temp = arr1[k];
                    arr1[k] = arr1[k-1];
                    arr1[k-1] = temp;
                }
            }
        }
    }
    for(int j=0; j<arr1.length;j++){
        System.out.print(" ,"+arr1[j]);
    }
}
}
