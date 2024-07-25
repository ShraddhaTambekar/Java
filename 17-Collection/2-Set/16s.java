//Collections(classs hai)........parent object class
//but i wnt to have data in sorted manner duplicate vi ek ke piche ek chahiye
//method static sort(list); //to sort list

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

        Collections.sort(al); 

        System.out.println(al); //[Ashish,Badhe,Kahna,Rahul,Shashi]

    }
}
