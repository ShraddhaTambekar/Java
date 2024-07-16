/*
 Q)Program to reverse the given number N
 */

 class Demo{
    public static void main(String []args){
        
        int N =123;
        int rem;
        int sum = 0;

        while(N!=0){
            rem = N%10;
            sum = sum*10 + rem;
            N = N/10;
        }

        System.out.println(sum);
    }
}