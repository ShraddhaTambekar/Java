import java.io.*;
class Demo{
    void getData() throws IOException{

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int data = 0;               //see scope and local variable

         try{                       //try used only keep that line jaha excepton ayega

          data = Integer.parseInt(br.readLine());     //numberformate exception object thrown from here

         }catch(NumberFormatException obj){          //reference

            System.out.println("String nahi int input do");   //catch mai jo user ko line dikhani hai vo yaha likho
         }
          System.out.println(data);
         
    }

    public static void main(String []args) throws IOException{ 
        System.out.println("in main");
        Demo obj = new Demo();
        obj.getData();
    }
}
