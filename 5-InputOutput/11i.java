import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);               
                                                                   
        System.out.println("Enter Player Name:");
        String name = br.readLine();                               
        
        System.out.println("Enter JerNo:");
        int JerNo = br.readLine();      //ct error: incompatible types: String cannot be converted to int
                                        //Incompatible type error come when class cannot be converted to primitive datatype
                                        //Incompatible type possible lossy conversion error come when primitive datatype cannot be interconverted
        System.out.println(name);
        System.out.println(JerNo);
                                             
    }
}

