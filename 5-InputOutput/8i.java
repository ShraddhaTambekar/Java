import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in); 

        System.out.println("Enter the character:");
        int ch = isr.read();   //i-A   

        System.out.println(ch);//o-65

        isr.close();           //Connection closed from JVM(runtime error),complier donot understand this
        
        System.out.println("Enter the character:");
        int ch1 = isr.read();
                                             
    }
}

