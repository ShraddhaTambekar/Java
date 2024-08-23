/*
 Q)WAP to take size of array from user and also elements in it, Print sum of odd / even elements
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

        int sumodd = 0;
        int sumeven = 0;
        for(int i = 0;i<size;i++){
           if(arr[i]%2==1){
               sumodd = sumodd + arr[i];
           }else{
               sumeven = sumeven + arr[i];
           }
        }
        System.out.println("Sum of odd elements - "+sumodd);
        System.out.println("Sum of even elements - "+sumeven);

    }
}

/*
output-
Enter Array Size - 
5
Enter Array Elements - 
1 2 3 4 5
Sum of odd elements - 9
Sum of even elements - 6
*/
