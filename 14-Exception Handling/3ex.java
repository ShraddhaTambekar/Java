//IOException
import java.io.*;
class Demo{
    void getData() throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int data = Integer.parseInt(br.readLine());

         System.out.println(data);
    }

    public static void main(String []args) throws IOException{ //if any method has exception and its solving it using throws then all methods in chain that call it till main should throw that exception
        System.out.println("in main");
        Demo obj = new Demo();
        obj.getData();
    }
}

/*output- compile time Exception(donot show even correct output)<---------before throwing
 * error: unreported exception IOException; must be caught or declared to be thrown
         int data = Integer.parseInt(br.readLine());

  output-in main<-------after handling using throws       
 */
/*
 * if we use any method that throw exception then 
 * 1)throws is used(mainly used for compile time exception )(if we have 100 method then all have to throw them thats why try catch came)(after handling it this way it will show output which is correct leaving exception part)
 *2)throws Exception is used 
 */