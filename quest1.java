package binarysearch;

public class quest1 {
 
    static int binarysearch(int[] arr,int target){
        int n=arr.length;
        int start=0, end=n-1;
        
        int fo=-1;
        while(start<=end){
           
         int mid=start+(end-start)/2;
         if(target==arr[mid]){
             fo=mid;
             end=mid-1;
             //or for last occurrence
             //start=mid+1;
         }else if(target<arr[mid]){
             end=mid-1;
         }else {
             start=mid+1;
         
         }
 
         }
         return fo;
 
 
     }

    public static void main(String[] args) {
        int[] arr={3,3,3,5,5,5,5,6,6,6};
       int target=6;
       System.out.println(binarysearch(arr, target));
    }
    
}
