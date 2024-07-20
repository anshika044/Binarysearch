package binarysearch;

public class rotatedarray {
    static int search(int[] a, int target){
        int n=a.length;
     int st=0,end=n-1;
     while(st<=end){
        int mid=st+(end-st)/2;
        if(target==a[mid]){
            return mid;
        }
        
        else if(a[mid]<a[end]){//mid to end sorted
            if(target>a[mid] && target<=a[end]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        } else{
            if(target>=a[st] && target<a[mid]){//st to mid sorted 
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
     }
      return -1;
    }

    public static void main(String[] args) {
        int[] a={4,6,7,1,2};
        int target=2;
        System.out.println(search(a, target));
    }
    
}
