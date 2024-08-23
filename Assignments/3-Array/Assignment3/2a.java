/*
 Q)Take array from user and print reverse of each element in array
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

        int rev = 0;
        for(int i = 0;i<arr.length;i++){
            int temp = arr[i];
            while(temp!=0){
                int rem = temp%10;
                rev = rev*10 + rem;
                temp = temp/10;
            }
            System.out.print(rev+" ");
            rev = 0;
        }

    }
 }

