import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);              
                                                       
        System.out.println("Enter the character:");
        String name = br1.readLine();           //i-Shraddha
        
        br1.close();
        
        System.out.println("Enter char:");    //rt Exception in thread "main" java.io.IOException: Stream closed
        int ch = (char)isr.read();    

        
                                             
    }
}

