/*
 Q)Given an integer N ,Print its all digits
 */

 class Demo{
    public static void main(String []args){

        int N = 77658;

        while(N!=0){
            System.out.println(N%10);
            N=N/10;
            }
        }
}

/*
 output-
       8
       5
       6
       7
       7
 */
 
