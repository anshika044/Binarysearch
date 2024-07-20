package binarysearch;

public class racetrackcaseques {

    static boolean kidsplaced(int[]a,int k,int dist){
        int kidplaced=1;
        int lastkid=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lastkid>=dist){
                kidplaced++;
                lastkid=a[i];
            }
        }
        if(kidplaced<k)return false;
        return true;
        //return kidsplaced>=k;
        
    }

    static int racetrack(int[]a,int k){
        if(k>a.length)return -1;
        int ans=0,st=0,end=(int) 1e9;
        while (st<=end) {
            int mid=st+ (end-st)/2;
            if(kidsplaced(a, k, mid)){
                ans=mid;
                st=mid+1;

            }else{
                end=mid-1;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a={1,2,4,8,9};
        int k=2;
        System.out.println(racetrack(a, k));
    }
    
}
