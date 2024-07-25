import java.util.*;
class CollectionDemo{
    public static  void main(String []args){
  
      List<Integer> obj = new ArrayList<Integer>(); 
      obj.add(10);
      obj.add(20);
      obj.add("Shashi");             //ct error: incompatible types: String cannot be converted to Integer
                                       //error occur as generic was written integer
      System.out.println(obj);         //[10, 20, Shashi]

    }
}
