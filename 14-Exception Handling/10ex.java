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

        }catch(NumberFormatException obj){

            System.out.println("wrong inpute enter int data");  
            data = Integer.parseInt(br.readLine());        //after given wrong data we agin take input(if still given wrong formate nested try catch is used)

        }
        System.out.println(data);
    }

}    