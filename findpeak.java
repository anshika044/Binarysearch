package binarysearch;

public class findpeak {

    static int peak(int[]arr){
        int n=arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(mid==0 || arr[mid]>arr[mid-1] && mid==n-1 || arr[mid]>arr[mid+1]){
            return mid;
            }
            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }else{
                st=mid+1;//uphill//ascending
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={6,2,1,3,4};
        System.out.println(peak(arr));
    }
}
