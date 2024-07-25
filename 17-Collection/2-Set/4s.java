//LinkedHashSet(came to preserve order of insertion)
//

import java.util.*;
class LinkedHashSetDemo{
    public static void main(String []args){
        
        LinkedHashSet hs = new LinkedHashSet();

        hs.add("Kahna");    
        hs.add("Ashish");
        hs.add("Badhe");
        hs.add("Rahul");
        hs.add("Ashish");
        hs.add("Rahul");

        System.out.println(hs);
    }
}