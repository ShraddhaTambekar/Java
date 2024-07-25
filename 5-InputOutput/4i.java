//InputStreamReader

import java.io.*;
class Demo{                                  
    public static void main(String []args){

        InputStreamReader isr = new InputStreamReader(System.in);   //we can also take input using ISR only but ISR can take single char input only

        System.out.println("Enter the character:");
        char ch = isr.read();                //ct error: incompatible types: possible lossy conversion from int to char      
                                             //ISR take char input and give it as int bcz read method return type is int     
                                             
    }
}