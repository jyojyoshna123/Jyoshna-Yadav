public class sumnaturalnumbers
{
    static int sumnaturalnumbers(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumnaturalnumbers(n-1);
        }
    }
    public static void main(String[] args){
        int terms=10;
         int result=sumnaturalnumbers(terms);
        System.out.println("sum of first"+terms+"naturalnumber is"+result);
    }
}