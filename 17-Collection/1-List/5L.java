//Arraylist

/*Normal Array points
 * 1)Random Access
 * 2)fix size
 * 3)similar data(datatype)
 * 4)to search or perform any operation on array we needed to write code on own
 * 5)duplicate data allowed(value)
 * 
 * Collection ArrayList
 * 1)dynamic size
 * 2)differeent data(datatype)
 * 3) predefined code for array operations
 * 4)duplicate data allowed(value)
 */
import java.util.*;
class ArrayListDemo{
    public static  void main(String []args){
  
      ArrayList obj = new ArrayList();      
      obj.add(10);
      obj.add(20.5f);
      obj.add("shashi");  
      obj.add(10);
      obj.add(20.5f);          

      System.out.println(obj);     
      
      //Methods of ArrayList


        

      
    

    

      //5)E get(int)

      //6)E set(int, E)

      //1)void add(int,E)
        obj.add(3,"core2web");
        System.out.println(obj);   //[10,20.5,shashi,core2web,10,20.5]

      //2)int size()
        System.out.println(obj.size());   //6   
        
      //3)boolean contains(object)
        System.out.println(obj.contains("shashi"));  //true
        System.out.println(obj.contains(30));        //false

        
      //4)int indexOf(object)
      System.out.println(obj.indexOf(20.5f));        //1(give index jaha pehle mila 20.5f)

      //5)int lastIndexOf(object)
        System.out.println(obj.lastIndexOf(20.5f));  //5(piche se dundhta hai)

      //8)E remove(int)

      //9)boolean remove(object)

      //10)void clear();

      //11)boolean addAll(java.util.Collection<? extends E>) or (Collection)

      //12)boolean addAll(int, java.util.Collection<? extends E>) or(int, Collection)

      //14)protected void removeRange(int,int)

      //15)java.lang.Object[] toArray()

      //boolean isEmpty();
      //boolean add(E)
    }
}
