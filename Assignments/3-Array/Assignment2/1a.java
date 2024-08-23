/*
 Q)write a program take array from user and print sum of all elements in it
 */

import java.util.Scanner; 
class Demo{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        
        System.out.println("sum-"+sum);

    }
}