import java.io.*;
class Demo2{
    public static void main(String []args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);               
                                                                   
        System.out.println("Enter Building Name:");
        String name = br.readLine();                               
        
        System.out.println("Enter wing:");
        char wing = (char)br.read();  

        br.skip(2);  //skips  1 char /n ..................................................

        System.out.println("Enter flatno:");
        int flatno = Integer.parseInt(br.readLine());   

        System.out.println(name);
        System.out.println(wing);      
        System.out.println(flatno);
                                             
    }
}//find a way to take char as input without using read