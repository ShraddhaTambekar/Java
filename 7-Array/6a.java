//taking user input data and size for array using scanner

import java.util.*;
class Demo{
    public static void main(String []args){
         
         Scanner sc = new Scanner(System.in);
          
         System.out.println("Enter size of array");
         int size = sc.nextInt();
         
         System.out.println("Give 5 data in array");
         int[] arr = new int[size];

         for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }

         System.out.println("Array Element");
         for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
    }
}
/*
output-
Enter size of array
3
Give 5 data in array
1
2
3
Array Element
1
2
3
 */
