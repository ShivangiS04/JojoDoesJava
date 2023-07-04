public class first and last occurence of element {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(string str,int idx,char element){
        if(idx==str.length()){
            system.out.println(first);
            system.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
                last=idx;
            }
            else{
                last=idx;
        }

        }
        findOccurance(arr,idx+1,element);
    }
    public static void main(String[] args){
        String str="abaacdaefaah";
        findOccurance(str,0,'a');
    }
    
