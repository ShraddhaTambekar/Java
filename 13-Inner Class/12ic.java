class Outer{   
    
    int x = 10;
    static int y = 20;

    class Inner{
        void fun2(){                      
           System.out.println("in inner fun2");
           System.out.println(x);                //inner class has outer can this alsothat why we are able to access(static ,non static)
           System.out.println(y);                //it cannot change it but   
           fun1();
        }
    }

    void fun1(){
        System.out.println("in outer fun1");
    }
}                                         

class Client{
    public static void main(String []args){

        Outer obj = new Outer();           

        Outer.Inner obj1 = obj.new Inner();
        obj1.fun2();

        Outer.Inner obj2 = obj.new Inner();
        obj2.fun2();

        
    }
}

