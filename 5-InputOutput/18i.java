import java.util.*;
import java.io.*;
class Demo{                                               
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);              
                                                       
        System.out.println("Enter the cSociety Name,Wing,flatno:");
        String info = br1.readLine();         //i-Shreenivas A 31 30.00

        StringTokenizer obj = new StringTokenizer(info," "); //Two parameter ( string to divide , seperation )

        String token1 = obj.nextToken();      //nextToken method divide the string 
        String token2 = obj.nextToken();
        String token3 = obj.nextToken();
        String token4 = obj.nextToken();


        System.out.println("Society name ="+ token1);     //o-Shreenivas
        System.out.println("wing =" + token2);            //o-A
        System.out.println("flatno =" + token3);          //o-31
        System.out.println("salary =" + token4);          //o-30.00

        char ch = token2.charAt(0);                 //converted into respective datatype    
        int i = Integer.parseInt(token3);
        float f = Float.parseFloat(token4);
                                                             
    }
}



