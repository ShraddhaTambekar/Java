class Outer{                            //ststic in inner class
    
    int x = 10;
    static int y = 20;

    class Inner{                        //we know static variable is not allowed in any {} in noemal class
        int a = 20;
        static int z = 20;              //error //static variable is not allowed in inner class(bcz if static was allowed in inner class then we can access it by Outer.Inner.z but outer this $0 (ised to known kiske outer pe inner class call hua hai) usme kuch data hoga hee nai)
                                        //inner class non static hai toh bahar ke client class se  access krne ke liye outer ka reference and inner class ka complusory object  bannana hee padta hai to access any thing static or non static isiliye static ni chalta(obj.new Inner.z)
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

        Outer.Inner obj1 = obj.new Inner();
        obj1.fun2();

        Outer.Inner obj2 = obj.new Inner();
        obj2.fun2();

        
    }
}
