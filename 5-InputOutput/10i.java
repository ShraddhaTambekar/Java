//InputStreamReader and BufferedReader

import java.io.*;
class Demo{                            
    public static void main(String []args)throws IOException{  

        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);               //BR take multiple inpute using readline method
                                                                   //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the character:");
        String name = br.readLine();  //i-Shraddha                             //As br.readLine throws IOException its complusory to handle it
                                                                   //readLine() method return type is string...and it can read full line of input till /n(enter) 
        System.out.println("Enter age:");
        int age = Integer.parseInt(br.readLine()); //i-20          //String input is converted into integer using Integer raper class and parsed (divide and convert)

        System.out.println(name);     //o-Shraddha
        System.out.println(age);      //o-20
                                             
    }
}

