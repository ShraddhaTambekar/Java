/*
 Break and continue are only used for loops
*/

/*
 Q)To print prime numbers(numbers which exactly have 2 factors)
*/

class Demo{
    public static void main(String []args){

        int N = 23,count = 0;
        
        for(int i = 1;i<=N;i++){
             if(N%i==0){
                count++;
             }
             if(count>2){
                break;
             }
        } 

        if(count==2){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }

    }
}

/*
 output-
       number is prime
 */

 /*
1)Break-once the break is applied the loop donot continue it stops
  */