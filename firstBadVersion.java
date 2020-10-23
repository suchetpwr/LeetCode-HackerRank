package leetcode;

/*Link to the problem - https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/*/
public class firstBadVersion {
private static boolean isBadVersion(int version){
    int badVersion = 44;
    if(version >= badVersion){
        return true;
    }
    else
        return false;
}

private static int badVersion(int n){
    int start=1;
    int end = n;
    int mid = 0;
    while(start < end){
        mid = start +((end-start)/2);
        //System.out.println(" start = "+start);
        //System.out.println(" end = "+end);
        //System.out.println(" mid = "+mid);
        //System.out.println("");
        if(!isBadVersion(mid)){
            start = mid+1;
        }
        else{
            end = mid;
        }
    }
    return start;
}
public static void main(String args[]){
    int n = 100;
    int result = badVersion(n);
    System.out.println(" result = "+result);
}    
}
