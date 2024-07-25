import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);               
                                                                   
        System.out.println("Enter Building Name:");
        String name = br.readLine();          //Takes the input with /n (enter) in pipe                    
        
        System.out.println("Enter wing:");
        char wing = (char)br.read();          //read method dont consider /n (enter) in remained in pipe

        System.out.println("Enter flatno:");
        int flatno = Integer.parseInt(br.readLine());   //therefore /n is taken here and exception ocuur

        System.out.println(name);
        System.out.println(wing);       
        System.out.println(flatno);
                                             
    }
}

