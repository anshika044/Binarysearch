package binarysearch;

public class recursion {

    static boolean binary(int[] arr, int start,int end,int target){
     //base
     if(start>end)return false;
     int mid=start+(start+end)/2;
     //selfcase
     if(target==arr[mid]){
        return true;
     }
     //recursion
     else if(target<arr[mid]){
     return binary(arr, start, mid-1, target);
     }else{
        return binary(arr, mid+1, end, target);
     }
      

    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int target=1;
        int n=arr.length;
        while(target!=10){
        System.out.printf(" %d is ans :%b \n", target,binary(arr, 0, n-1, target));
        target++;
        }
        
    }
    
}
