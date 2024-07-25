//
import java.util.*;
class TreeSetDemo{
    public static void main(String []args){

        TreeSet ts = new TreeSet();

        ts.add(new String("Kahna"));    //object made with new nd ashish both are object only internally Ashish is also made with new string
        ts.add(new String("Rahul"));
        ts.add(new String("Badhe"));
        ts.add("Ashish");

        System.out.println(ts);
    }
}