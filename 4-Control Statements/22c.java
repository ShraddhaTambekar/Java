/*Nested For Loop */

class Demo{
    public static void main(String []args){

        for(int i = 1;i<=5;i++){
            for(int j = 1;j<7;j++){
                System.out.print("*");
            }
            System.out.println();        //-------->helps to go to new row
        }
    }
}

/*
 output-
        ******
        ******
        ******
        ******
        ******
 */

/*
1)Outer for loop represents the row 
2)Inner for loop represents the column
*/
