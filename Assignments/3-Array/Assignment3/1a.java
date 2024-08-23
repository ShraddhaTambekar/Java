/*
 Q)Take array from user and print count of digits of each element in array
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
            while(temp!=0){
                temp = temp/10;
                count++;
            }
            System.out.print(count+" ");
            count = 0;
        }

    }
 }

