
import java.util.*;
class HashSetDemo{
    public static void main(String []args){

        HashSet hs = new HashSet();

        hs.add("Kahna");
        System.out.println(hs.add("Ashish"));
        hs.add("Badhe");
        hs.add("Rahul");
        hs.add("Ashish");
        System.out.println(hs.add("Rahul"));

        System.out.println(hs);
                
    }
}