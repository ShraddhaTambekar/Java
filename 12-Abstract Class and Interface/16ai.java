interface Demo{                          //main reason to bring interface is to support multiple inheritance bcz 100 percent abstraction can also be done throught abstract class
    void fun();                          //if we want to give body in interface we use static and default modifier

    static void gun(){                   //interface static method can have body bcz its call and cannot be inherited
                                         //before 1.8 strictly no method would have body in interface
    }                                    // if interface has 100 child had have one common method to reduce redant code static and default keyword is used
    default void run(){                  //here default is modifier not access specifier

    }                                   //in interface static is not like class stactic it just say its class unique static and default
}                                        

interface Demo2{
    void fun();                
}

class DemoChild implements Demo1,Demo2{

    public void fun(){
         System.out.println("in fun child");
     }
    
}

class Client{
    public static void main(String []args){

        Demo1 obj1 = new DemoChild();
        obj1.fun();

        Demo2 obj2 = new DemoChild();
        obj2.fun();


    }
}

