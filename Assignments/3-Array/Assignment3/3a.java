/*
 Q)Take array from user and print composite numbers in array
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

        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int temp = arr[i];
            for(int j = 1;j<=arr[i];j++){
               if(temp%j==0){
                count++;
               }
            }
            if(count>2){
                System.out.println("Composite number "+ arr[i]+" found at index "+ i);
            }
            count = 0;
        }

    }
}


