//numberformate exception
import java.io.*;
class Demo{
    void getData() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str);

        int data = 0;

        try{

           data = Integer.parseInt(br.readLine());

        }catch(IllegalArgumentException obj){                //sequence matter child to parent and last should be default(bcz if no catch catch the obj the it go to DEH)
                                                            
            System.out.println("wrong inpute enter int data");  
            data = Integer.parseInt(br.readLine());        

        }catch(NumberFormatException obj){                    //else error come 
            System.out.println("wrong inpute enter int data");  
            data = Integer.parseInt(br.readLine()); 
        }


        System.out.println(data);
    }

}    