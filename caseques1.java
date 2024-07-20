package binarysearch;

public class caseques1 {

    static boolean isdivisionpossible(int[] arr, int m,int maxchocallowed){//mid=maxchocallowed
    int numofstudents=1;
    int choc=0;
    for(int i=0; i<arr.length;i++){
        if(arr[i]>maxchocallowed)return false;
        if(choc+arr[i]<=maxchocallowed){
            choc+=arr[i];
        }else{
            numofstudents++;
            choc=arr[i];
        }
    }
    if(numofstudents>m)return false;
    return true;
    }

    static int distributedchocolate(int[] arr,int m){
        if(arr.length<m)return -1;
        int ans=0,st=1,end=(int)1e9;
        while (st<=end) {
        int mid=st+(end-st)/2;
        if(isdivisionpossible(arr, m, mid)){
            ans=mid;
            end=mid-1;//min found krna h

        }else{
            st=mid+1;
        }
            
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr={12,34,67,90};
        int m=2;
        System.out.println(distributedchocolate(arr, m));
    }
    
}
