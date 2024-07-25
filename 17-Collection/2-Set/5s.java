//important code
//in hash set duplicate data is not allowed
//object here made are different it consider them different(content is inside object)
////for user defined class data see next codesss.....we make user defined class object so content comparison wala code we have not written therefore it consider every object different only
import java.util.*;
class CricPlayer{
    int jerNo = 0;
    String pName = null;

    CricPlayer(int jerNo,String pName){
        this.jerNo = jerNo;
        this.pName = pName;
    }

    //we did not override toString method in this code see address
     
}

class LinkedHashSetDemo{
    public static void main(String []args){

        LinkedHashSet hs = new LinkedHashSet();

        hs.add(new CricPlayer(18,"Virat"));
        hs.add(new CricPlayer(7,"MSD"));
        hs.add(new CricPlayer(45,"Rohit"));
        hs.add(new CricPlayer(7,"MSD")); //if we donot override toString in user defined class CrickPlayer then its address are printed 
                                                     //address of msd is different but it compare the string and if its duplicate removes it
        System.out.println(hs);
    }
}
