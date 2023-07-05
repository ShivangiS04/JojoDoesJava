public class array sorted or not {
    public static boolean isSorted(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        boolean ans=isSorted(arr,idx+1);
        return ans;
    }
    
}
