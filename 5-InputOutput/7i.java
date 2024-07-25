import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in); 

        System.out.println("Enter the character:");
        int ch = isr.read();   //i-A    //Even if we give it input A it convert into integer and print its ascii value
        
        System.out.println(ch);//o-65
                                             
    }
}
