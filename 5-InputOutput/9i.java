import java.io.*;
class Demo{
    public static void main(String []args)throws IOException{  //checks the connection is proper or not if not then throws exception as below

        InputStreamReader isr = new InputStreamReader(System.in); 

        System.out.println("Enter the character:");
        int ch = isr.read();   //A   

        System.out.println(ch);//65

        isr.close();           //Connection closed from JVM(runtime error),complier donot understand this
        
        System.out.println("Enter the character:");
        int ch1 = isr.read();  //takes /n left in pipe

        System.out.println("Enter the character:");
        int ch2 = isr.read();  /*rt Exception in thread "main" java.io.IOException: Stream closed
                                          at java.base/sun.nio.cs.StreamDecoder.ensureOpen(StreamDecoder.java:47)
                                          at java.base/sun.nio.cs.StreamDecoder.read(StreamDecoder.java:149)
                                          at java.base/sun.nio.cs.StreamDecoder.read0(StreamDecoder.java:128)
                                          at java.base/sun.nio.cs.StreamDecoder.read(StreamDecoder.java:113)
                                          at java.base/java.io.InputStreamReader.read(InputStreamReader.java:164)
                                          at Demo.main(9i.java:18)*/
                                             
    }
}

