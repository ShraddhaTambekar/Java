//Autoboxing

class Demo{
    public static void main(String []args){

         int x = 10;
         int y = 10;
         Integer z = 10;
         Integer w = new Integer(10);

         System.out.println(System.identityHashCode(x));
         System.out.println(System.identityHashCode(y)); 
         System.out.println(System.identityHashCode(z));
         System.out.println(System.identityHashCode(w)); 
          
    }
}

/*
 1)Autoboxng- is conversion from primitive int to Integer Wrapper class(saves memory)
 2)is integer is made with new then it will have different hashcode
 */

/*
 output-
1973538135
1973538135
1973538135
1365202186
 */
