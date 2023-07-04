public class reversing a string {
    public static void printRev(String str,int idx)
    {
        if(idx==0)
        {
            system.out.println(str.charAt(idx));
        }
   system.out.println(str.charAt(idx));
   printRev(str,idx-1);
    }
    public static void main(String[] args){
        String str="abcd";
        printRev(str,str.length()-1);
    }
    
}
