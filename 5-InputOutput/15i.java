import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));              
                                                       
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); //connection is closed for theard(program) ,all so we make any number of obj the connection to keyboard is closed

        System.out.println("Enter the name:");
        String name = br1.readLine();                //i-Shraddha
        
        br1.close();
        
        System.out.println("Enter age:");
        int age = Integer.parseInt(br2.readLine());  //rt Exception in thread "main" java.io.IOException: Stream closed  

        
                                             
    }
}

