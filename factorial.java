public class factorial
{
    static int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        int terms=6;
         int result=factorial(terms);
        System.out.println("factorial of"+terms+"is"+result);
    }
}