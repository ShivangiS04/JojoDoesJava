public class Recursion1{
    pulic static void printNumb(int n){
        if(n==0){
            return;
        }
        system.out.println(n);
        printNumb(n+1);
    }

    public static void main(String[] args){
        int n=1;
        printNumb(n);//n=1
    }
}