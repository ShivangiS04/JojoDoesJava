public class permutations {

    public static void printPermutation(String str,int idx, String perm){
        if(str.length()==0){
            system.out.println(perm);
            return;
        }
        for(int 1=0; i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,idx+1,perm+currChar);
        }
    }
public static void main(String args[])
{
    String str ="abc";
    printPermutation(str,0,"");   
}

//Time complexity=O(n*n!)
