/*
 Q)Multiplication of digit
 */

class Demo{
    public static void main(String []args){

        int N = 135;
        int mul = 1;

        while(N!=0){
            int x = N%10;
            mul = mul*x;
            N = N/10;
        }

        System.out.println(mul);
    }
    
}

/*
 outpu- 
        15
 */