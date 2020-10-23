package leetcode;
/*Problem Link - https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/ */
public class ArrayDuplicates {
    public static void main(String[] args) {
        int inArray[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int counter=1;
        int temp;
        for(int i =0; i<inArray.length;i++)
        {
            for(int j = i+1; j<inArray.length;j++)
            {
                if(inArray[i]!=inArray[j])
                {
                    if(inArray[i]<inArray[j])
                    {
                        inArray[i+1] = inArray[j];
                        break;
                    }
                }
            }
        }
        for(int p=0; p<inArray.length; p++)
        {
            System.out.println(" "+inArray[p]);
        }
        for(temp=1; temp<inArray.length;temp++){
            if(inArray[temp-1]<inArray[temp])
                counter++;
            else
                break;
        }
        System.out.println("The length of new array is "+counter);
        
    }
    
}
