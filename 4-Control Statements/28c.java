/*
 Print-A 1 B 2
       A 1 B 2
       A 1 B 2
*/

class Demo{
    public static void main(String []args){
        
        int x = 1;
        char ch = 'A';

        for(int i = 1;i<=3;i++){
            if(i%2==0){
                System.out.print(x++ + " ");
            }else{
                System.out.println(ch++ + " ");
            }
            System.out.println();    
        }
    }
}
