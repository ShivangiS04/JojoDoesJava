public class Recursion2{
    public static void towerOfHanoi(int n,String src,String src, String helper, String dest){
        if(n==1)
        {
            system.out.println("transfer disk"+ n +"from"+src +"to"+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        system.out.println(n-1,helper,src,dest);
    }
public static void main(String args[])
{
    int n=3;
    towerOfHanoi(n,"S","H","D");
}

}