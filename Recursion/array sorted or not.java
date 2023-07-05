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

public static void main(string args[])
    int arr[]={1,3,5};
system.out.println(isSorted(arr,0));
 }
}
