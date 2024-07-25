import java.util.*;
class HashSetDemo{
    public static void main(String []args){

        HashSet hs = new HashSet();

        hs.add("Kahna");
        hs.add("Ashish");
        hs.add("Badhe");
        hs.add("Rahul");
        hs.add("Ashish");             //predefined data string class ...their object is different but hashset compares its content using methods 
        hs.add("Rahul");

        System.out.println(hs);
                
    }
}
