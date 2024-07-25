//version 11 string buffer become comparable
//even jdk has differnt versions in that java same version can have different feature
import java.util.*;
class TreeSetDemo{
    public static void main(String []args){

        TreeSet t = new TreeSet();

        t.add(new StringBuffer("Kahna")); //
        t.add(new StringBuffer("Ashish"));
        t.add(new StringBuffer("Badhe"));
        t.add(new StringBuffer("Rahul"));
        t.add(new StringBuffer("Rahul"));
        
        System.out.println(t);

    }
}