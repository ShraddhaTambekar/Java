/*
Q)Given an integer input A which represents units of electricity consumed at your house calculate and print the bill amount
 1)unit <=100 price per unit is 1
 2)unit >100 price per unit is 2
*/

class Demo{
    public static void main(String []args){

        int A = 200;

        if(A<=100){
            System.out.println("Bill Amount - " + A);
        }else{
            int y = (A-100)*2 + 100;
            System.out.println("Bill Amount - " + y);
        }

    }
}

/*
 output-
       Bill  Amount - 300
*/