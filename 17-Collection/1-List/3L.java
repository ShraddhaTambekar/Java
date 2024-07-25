import java.util.*;
class CollectionDemo{
    public static  void main(String []args){
  
      List obj = new ArrayList();      
      obj.add(10);
      obj.add(20);
      obj.add("Shashi");             //as generics not written no error for this

      System.out.println(obj);         //[10, 20, Shashi]

    }
}
