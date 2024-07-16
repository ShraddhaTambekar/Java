/*
 Print- 1 2 3 
        4 5 6
        7 8 9
 */

class Demo{
    public static void main(String []args){

        int x = 1;

        for(int i = 1;i<=3;i++){
            for(int j = 1;j<=3;j++){
                System.out.print(x+" ");
                x++;
            }

            System.out.println();
        }
    }
}
