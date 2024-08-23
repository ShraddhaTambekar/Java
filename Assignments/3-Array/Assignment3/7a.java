
/*
 Q)Take array from user and print Strong number in array
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
            int sum = 0;
            for(int j = 1;j<=arr[i];j++){
                if(arr[i]%j==0){
                   sum = sum + j;
                }
            }
            System.out.println(sum);
        }

    }
}


