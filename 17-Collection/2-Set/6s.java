//giving string  data with new in hashset
import java.util.*;
class HashSetDemo{
    public static void main(String []args){
        
        HashSet hs = new HashSet();

        hs.add(10);                  //in collection all data is oject therefor this goes internally as new Integer(10);
        hs.add(20);
        hs.add(new Integer(10));//this is also predefined class object they has written internal code to compare coomtent object to alag hee hai 
        hs.add(new Integer(20));

        System.out.println(hs);
    }
}