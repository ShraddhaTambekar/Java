//taking user input data and size for array using bufferreader

import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter size of array");
         int size = Integer.parseInt(br.readLine());
         
         System.out.println("Give 5 data in array");
         int[] arr = new int[size];

         for(int i = 0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
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
