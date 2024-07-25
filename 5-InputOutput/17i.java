import java.util.*;
import java.io.*;
class Demo{                            //String Tokenizer Class(Util Package) in ISR/BR
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);              
                                                       
        System.out.println("Enter the cSociety Name,Wing,flatno:");
        String info = br1.readLine();         //i-Shreenivas A 1

        StringTokenizer obj = new StringTokenizer(info," "); //Two parameter ( string to divide , seperation )

        String token1 = obj.nextToken();      //nextToken method divide the string 
        String token2 = obj.nextToken();
        String token3 = obj.nextToken();

        System.out.println("Society name"+ token1);   //o-Shreenivas
        System.out.println("wing" + token2);          //o-A     ...its string
        System.out.println("flatno" + token3);        //o-1     ...its string



                                                     
    }
}


