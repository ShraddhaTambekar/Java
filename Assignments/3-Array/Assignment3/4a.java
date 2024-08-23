
/*
 Q)Take array from user and print perfect number in array
*/

import java.util.*;
class Demo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array-");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements-");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++){
            
            for(int j = 0;j<=arr[i];j++){
               if(j*j==arr[i]){
                System.out.println(arr[i]);
               }
            }
        }

    }
}


