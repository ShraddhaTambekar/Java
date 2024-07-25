import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);               
                                                                   
        System.out.println("Enter Building Name:");
        String name = br.readLine();                               
        
        System.out.println("Enter wing:");
        char wing = (char)br.read();   //As wing is single char we use read method and its return type is int therefore we type cast
                                       
        System.out.println("Enter flatno:");
        int flatno = Integer.parseInt(br.readLine());   

        System.out.println(name);
        System.out.println(wing);    //rt Exception in thread "main" java.lang.NumberFormatException: For input string: ""...as /n (Enter is remaining in pipe next flatno. take it as input)   
        System.out.println(flatno);
                                             
    }
}

