/*
 Q)Print sum of digits Input -6531 Output-15
 */

 class Demo{
    public static void main(String []args){

        int N = 6531;
        int sum = 0;

        while(N!=0){
            int x = N%10;
            sum = sum + x;
            N = N/10;
        }

        System.out.println(sum);
    }
}

/*
 output-
        15
 */
