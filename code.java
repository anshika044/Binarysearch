package binarysearch;

public class code {
    static boolean binarysearch(int[] arr,int target){
       int n=arr.length;
       int start=0, end=n-1;
       
       while(start<=end){
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return true;
        }else if(target<arr[mid]){
            end=mid-1;
        }else {
            start=mid+1;
        
        }

        }
        return false;


    }


    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6};
       int target=0;
       while(target!=10){
       System.out.printf(" %d ans is: %b \n ",target,  binarysearch(arr, target));
       target++; 
       }
    }
    
}
