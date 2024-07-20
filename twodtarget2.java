package binarysearch;

import java.util.Scanner;

public class twodtarget2 {

    static boolean search(int[][] arr, int target){
        int n=arr.length;
        int m=arr[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(target==arr[i][j]){
            return true;
            }
            else if(target<arr[i][j]){
                j--;//move left
            }else{
                i++;//move down
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int n=sc.nextInt();
        System.out.println("enter col");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        //input
        for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter target");
    int target=sc.nextInt();
    System.out.println(search(arr, target));
    }
    
}
