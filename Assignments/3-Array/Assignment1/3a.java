/*
Q)WAP to take 7 character as an input ,Print only vowels from the array
  Using Scanner
*/

import java.util.Scanner;
class Demo{
   public static void main(String []args){

       Scanner sc = new Scanner(System.in);

       char[] arr = new char[7];

       System.out.println("Enter Array Elements - ");
       for(int i = 0;i<arr.length;i++){
            arr[i] = sc.next().charAt(0);
       }

       for(int i = 0;i<arr.length;i++){
            if(arr[i]=='a'|arr[i]=='e'|arr[i]=='o'|arr[i]=='u'|arr[i]=='i'){
                  System.out.print(arr[i]+" ");
            }
       }
       System.out.println();

   }
}
