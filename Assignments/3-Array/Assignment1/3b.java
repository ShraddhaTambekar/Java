/*
Q)WAP to take 7 character as an input ,Print only vowels from the array
  Using BufferedReader
*/

import java.io.*;
class Demo{
   public static void main(String []args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
       char[] arr = new char[7];

       System.out.println("Enter Array Elements - ");
       for(int i = 0;i<arr.length;i++){
            arr[i] = (char)br.read();
       }

       for(int i = 0;i<arr.length;i++){
            if(arr[i]=='a'|arr[i]=='e'|arr[i]=='o'|arr[i]=='u'|arr[i]=='i'){
                  System.out.print(arr[i]);
            }
       }
       System.out.println();

   }
}