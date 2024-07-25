//collection say u can fill similar typr or differnt type of data in it problem bus generic ke krn ati hai
//List(interface ....iska bus refrence chalega object nai)
/*1)duplicate data allowed(content)
 *2)single data only
  3)sequnce - jis sequnce mai input diya hoga uski sequnece mai list banegi(insertion order preserve)

  list
  Arraylist
  Linklist
  Vectorlist
    -stack
 */

import java.util.*;
class CollectionDemo{
    public static  void main(String []args){
  
      List obj = new ArrayList(); //Parent refrence child object ...only that methods could be called which are present in parent class and child both)(compiler check left side )
      obj.add(10);
      obj.add(20);
      obj.add(30);

      System.out.println(obj);

    }
}
/*
 * output-javac 1L.java
 *        Note: 1L.java uses unchecked or unsafe operations.
          Note: Recompile with -Xlint:unchecked for details.

          java CollectionDemo
          [10,20,30]

   This note is telling that u should mention that same kind of data is coming in ur list
   just ignore the note and run the code

 */