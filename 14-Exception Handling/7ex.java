import java.io.*;
class Demo{
    void getData() throws IOException{ //throws mainly used for compile time exception

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str);

        br.close();

        String str2 = br.readLine();
        System.out.println(str2);
         
    }

    public static void main(String []args) throws IOException{ 
        System.out.println("in main");
        Demo obj = new Demo();
        
    }
}
