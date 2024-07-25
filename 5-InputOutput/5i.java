import java.io.*;
class Demo{
    public static void main(String []args){

        InputStreamReader isr = new InputStreamReader(System.in);   //we can also take input using ISR only but ISR can take single char input only

        System.out.println("Enter the character:");
        char ch = (char)isr.read();              /*ct error: unreported exception IOException; must be caught or declared to be thrown
                                                  Even if we typecaste the input in char still error come 
                                                  Bcz read method throw io exception which we have to handle*/     
                                             
    }
}