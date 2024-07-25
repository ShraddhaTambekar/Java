//try catch
import java.io.*;
class Demo{
    void getData() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int data = 0;               //see scope and local variable

         try{                       //try used only keep that line jaha excepton ayega

          data = Integer.parseInt(br.readLine()); 

         }catch(NumberFormatException obj){     

            System.out.println(obj.toString()); //obj.getPrintStackTrace(should not print in sop bcz its return type is void), obj.getmessage ,
         }
          System.out.println(data);
         
    }

    public static void main(String []args) throws IOException{ 
        System.out.println("in main");
        Demo obj = new Demo();
        obj.getData();
    }
}
