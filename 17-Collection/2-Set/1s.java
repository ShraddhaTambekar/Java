//Hashset()
//has no index
////in hash set duplicate data is not allowed for predefined class data  like int,float,double 
//in predefined class object they have methods to compare the content of data and s duplicate data is removed
///for user defined class data see next codesss.....we make user defined class object so content comparison wala code we have not written therefore it consider every object different only
import java.util.*;
class HashSetDemo{
    public static void main(String []args){

        HashSet hs = new HashSet();

        hs.add(10);  //collection no data is premitive internally its new Integer(10);
        hs.add(20);
        hs.add(10);
        hs.add(10);

        System.out.println(hs);
                
    }
}
