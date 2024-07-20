package binarysearch;
import java.util.*;
public class twodtarget {
    static boolean search(int[][] arr, int target){
        int r=arr.length;
        int c=arr[0].length;
        int st=0,end=r*c-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midelem = arr[mid/c][mid%c];
            if(target==midelem)return true;
            else if(target<midelem){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
        System.out.println("enter col");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        //input
        for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter target");
    int target=sc.nextInt();
    System.out.println(search(arr, target));
    }
    
}
