/*
 Q)write a code to check whether the number is pallindrome or not 
 */

class Demo{
    public static void main(String []args){
        
        int N = 8646;
        int rev = 0;
        int temp = N;

        while(N!=0){
            int rem = N%10;
            rev = rev*10 +rem;
            N = N/10;
        }

        if(temp==rev){
            System.out.println("Number is Pallindrome");
        }else{
            System.out.println("Number is not Pallindrome");
        }
    }
} 

/*
 output-
        Number is not Pallindrome
 */