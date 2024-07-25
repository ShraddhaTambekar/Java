/*
 Q)take N as input , Print N is armstrong number or not(addition of qube is equal to the original number)
 */

class Demo{
    public static void main(String []args){

        int N = 153, temp = N, sum = 0;
        
        while(N!=0){
             int rem = N%10;
             sum = sum+(rem*rem*rem);
             N=N/10;
        }
        
        if(temp==sum){
            System.out.println("Number is armstrong number");
        }else{
            System.out.println("Number is not armstrong number");
        }
        
    }
}

/*
 output-
       Number is armstrong number
 */
