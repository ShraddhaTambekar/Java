/*
 Q)Take 2 arrays from user and merge them
 */

 import java.util.Scanner;
 class Demo{
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Enter size of array1");
         int size1 = sc.nextInt();
 
         int arr1[] = new int[size1];
 
         System.out.println("Enter elements in array1");
         for(int i = 0;i<arr1.length;i++){
             arr1[i] = sc.nextInt();
         }
 
         System.out.println("Enter size of array2");
         int size2 = sc.nextInt();
 
         int arr2[] = new int[size2];
 
         System.out.println("Enter elements in array2");
         for(int i = 0;i<arr2.length;i++){
             arr2[i] = sc.nextInt();
         }
 
         int arr3[] = new int[size1+size2];

         for(int i = 0;i<arr1.length;i++){
            arr3[i]=arr1[i];
         }

         for(int i = 0;i<arr2.length;i++){
            arr3[size1+i]=arr2[i];
         }

         System.out.println("Merged array-");
         for(int i = 0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
         }
         
        }
}


