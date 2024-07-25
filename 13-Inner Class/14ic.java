class Outer{                            

    int x = 10;
    static int y = 20;

    class Inner{                       
        int a = 30;
        final static int z = 20; // (but when we use final static variable then variable work) (whenever we write static variable in inner class make it final)         
    
        void fun2(){                   
           System.out.println("in inner fun2");
        }
    }

    void fun1(){
        System.out.println("in outer fun1");
    }
}                                          

class Client{
    public static void main(String []args){

       Outer obj = new Outer();           

     //   Outer.Inner obj1 = obj.new Inner();
      //  obj1.fun2();
        System.out.println(Outer.Inner.z); //(Inner.z correct hai bcz static can be accessed with class nme but Outer.Inner wrong hai bcz inner class toh non static hai)
        System.out.println(obj.new Inner().z); //now it work 
    }
}
