import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{   // IOException is handled

        InputStreamReader isr = new InputStreamReader(System.in); 

        System.out.println("Enter the character:");
        char ch = (char)isr.read(); //i-A
        
        System.out.println(ch);     //o-A

                                             
    }
}