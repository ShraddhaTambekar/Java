/*
 Q)WAP to take array size from user and also elements in it, Print product of odd indexed elements
*/

import java.util.Scanner;
class Demo{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size - ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements - ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int prod = 1;
        for(int i = 0;i<size;i++){
            if(i%2==1){
                prod = prod*arr[i];
            }
        }
        System.out.println("Product of odd indexed elements - " + prod);
    }
}

/*
output-
Enter Array Size - 
5
Enter Array Elements - 
0 1 2 3 4
Product of odd indexed elements - 3
*/
