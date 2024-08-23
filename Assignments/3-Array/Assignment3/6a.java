
/*
 Q)Take array from user and Armstrong number in array
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
            int temp = arr[i];
            int count = 0;
               while(temp!=0){
                   temp=temp/10;
                   count++;
               }
            temp = arr[i];
            int sum = 0;
            while(temp!=0){
                int mul = 1;
                int rem = temp%10;
                for(int j = 0;j<count;j++){
                    mul = mul*rem;
                }
                sum = sum + mul;
                temp = temp/10;
            }  
            if(sum == arr[i]){
                System.out.print(arr[i]+" ");
            }    
            
        }
}
}


