public class permutation of a string {

    public static void printPerm(String str,string permutation){

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            //"abc"->"ab"
            String newStr=str.substring()0,i)+str.substring(i+1);
            printPerm(newStr,permutation+currChar);
        }

    }

    public static void main(String[] args){
        String str="abc";
        printPerm(str,"");
        
    }
    
}
//Time complexity:O(n*n!)
