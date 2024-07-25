/*
 Print-A B C
       D E F
       G H I
*/

class Demo{
    public static void main(String []args){

        char x = 'A';

        for(int i = 1;i<=3;i++){
            for(int j = 1;j<=3;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
    
        }
    }
}
