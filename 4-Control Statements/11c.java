/*
 Q)Print perfect square till N
 */

class Demo{
    public static void main(String []args){

        int N = 78;
        int i = 1;

        while(i<=78){
            int sqr = i*i;
            if(sqr<=30){
                 System.out.println(sqr);
            }
            i++;
        }
    }
}
/*
 1)2nd approach
    int i = 1;
    while(i*i<=N){
        Ssystem.out.println(i*i);
        i++;
    }
 */

/*
 output-
        1
        4    
        9
        16
        25
 */