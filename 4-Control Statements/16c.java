/*
Q)Take N as input , Print all its factor and count all its factor
 */

 class Demo{
    public static void main(String []args){

        int N = 6;
        int countFactor = 0;

        for(int i = 1;i<=N;i++){
            if(N%i==0){
                System.out.println(i);
                countFactor++;
            }
        }

        System.out.println("countFactor = "+countFactor);
    }
 }

/*
 output-
        1
        2
        3
        6
        countFactor = 4
 */