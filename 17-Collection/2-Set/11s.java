//user defined class vese be koi comparae krne ke methods hai nai 
//Comaparable class javap java.lang.Comparable
//comparable class only has one method abstract int compareTo(T);
import java.util.*;
class MyClass{

    String str = null;

    MyClass(String str){
        this.str = str;
    }
}

class TreeSetDemo{
    public static void main(String []args){

        TreeSet ts = new TreeSet();

        ts.add(new MyClass("Kahna"));   //error bcz our class is not comparable
        ts.add(new MyClass("Rahul"));
        ts.add(new MyClass("Badhe"));
        ts.add(new MyClass("Ashish"));

        System.out.println(ts);
    }
}