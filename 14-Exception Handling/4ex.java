//numberFormateexception
import java.io.*;
class Demo{
    void getData() throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int data = Integer.parseInt(br.readLine());

         System.out.println(data);
    }

    public static void main(String []args) throws IOException{ 
        System.out.println("in main");
        Demo obj = new Demo();
        obj.getData();
    }
}

/*
 * output(run time exception)<-----------before handling
in main
Shraddha
Exception in thread "main" java.lang.NumberFormatException: For input string: "Shraddha"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.base/java.lang.Integer.parseInt(Integer.java:652)
        at java.base/java.lang.Integer.parseInt(Integer.java:770)
        at Demo.getData(4ex.java:6)
        at Demo.main(4ex.java:14) 
        
        

DEH(it is a jvm funstion)
when exception object is thrown it goes till jvm then DEH calles 
1)printstacktrass method of that exception class(out- threadname, exception name,decription,stack trass) 
or 2)calls getmmessage method it only print msg
or 3)calls toStringmethod of object class  

                  */
