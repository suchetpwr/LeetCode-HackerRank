public class removeElement {
    
    public static void removeElm(int[] arr, int k){
        int ptr = arr.length-1;
        int len = arr.length;
        if(len == 0 || len == 1 && arr[0] != k){
            System.out.println("0");
        }
        else if(len == 1 && arr[0] == k){
            System.out.println(k);
            arr = new int[0];
            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                if(arr[ptr] != k){
                    arr[i] = arr[ptr];
                    ptr--;
                    len--;
                } else {
                    if(ptr>i){
                        while(arr[ptr] == k){
                            ptr --;
                        }
                        if(arr[ptr] != k){
                            arr[i] = arr[ptr];
                            ptr--;
                            len--;
                    }
                    if(ptr == i){
                        break;
                    }
                    } 
            }
        }
        for(int j=0; j<len; j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.println("Length without k = "+len);
    }
}
    public static void main(String []args){
        int[] arr1 = {1,1};
        int k = 1;
        removeElm(arr1, k);
    }
}
