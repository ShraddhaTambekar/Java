//sortedset is interface give  output in sorted manner
//sorted set is interface therefore uska object nai banega navigable bhi interface has so treeset class ka object banake sorted set ke methods use krege
/*
 * method
 * 1)SortedSet subSet(E,E); ex- [20,30,40,50,60] subset[20,60]....output-[20.30.40.50] leave last value
 * 2)SortedSet headSet(E);  ex-headSet[30]...output-[20]...gives set of elements before that value
 * 3)SortedSet tailSet(E);  ex-tailSet[30]...output-[40,50,60]...gives set of elemets after that value
 * 4)E first();
 * 5)E last();
 */

 //navigable set(interface hai object nai banega)
 /*child of sorted set 
  
 */

 //TreeSet(class object can be made)speciality sorted output
 /* clonable and serializable no random as no index
  Constructor
  1)TreeSet();
  2)TreeSet(Comparator);
  3)TreeSet(Collection);
  4)TreeSet(SortedSet); 
  * 
 */
import java.util.*;
class TreeSetDemo{
    public static void main(String []args){

        TreeSet ts = new TreeSet();

        ts.add(10);//sorted number wise
        ts.add(20);
        ts.add(30);
        ts.add(40);

        System.out.println(ts);
    }
}