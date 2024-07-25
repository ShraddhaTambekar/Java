//implementing comparable in myclass
//company may ese user defined use hota hai data toh imp hai code
//kabhi esa clsss dikha jo mplement krra ho comparable ko company mai samjhna treeset ke call hai agee
import java.util.*;
class MyClass implements Comparable{
    String str = null;

    MyClass(String str){
        this.str = str;
    }

    public int compareTo(Object obj){         
        return (obj.str).compareTo(this.str); //descending order   //String class method is used  to compareTo           //here compare logic should be written
    }

    public String toString(){
        return str;
    }
}

class TreeSetDemo{
    public static void main(String []args){

        TreeSet ts = new TreeSet();

        ts.add(new MyClass("Kahna"));   
        ts.add(new MyClass("Rahul"));
        ts.add(new MyClass("Badhe"));
        ts.add(new MyClass("Ashish"));

        System.out.println(ts);
    }
}

