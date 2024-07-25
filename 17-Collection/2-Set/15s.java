//yaha hum arraylistt likhke collection pass kr sakte hai sort krke milega + no duplicate values

import java.util.*;
class SortDemo{
    public static void main(String []args){

        ArrayList al = new ArrayList(); //arraylist

        al.add("Kahna");  
        al.add("Ashish");
        al.add("Badhe");
        al.add("Shashi");
        al.add("Rahul");

        System.out.println(al); //[Kahna,Ashish,Badhe,Rahul]

        TreeSet ts = new TreeSet(al);

        System.out.println(ts);   //[Ashish,Badhe,Kahna,Ashish,Rahul,Shashi]

    }
}