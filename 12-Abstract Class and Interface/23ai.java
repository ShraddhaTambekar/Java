interface Demo1{        //when we have 2 inteface they are implemented in child then child is told to override it to avoid confusion ambiguity

    default void m1(){
        System.out.println("Demo1-m1");
    }
}

interface Demo2 {
    default void m1(){
        System.out.println("Demo2-m1");
    }             
}

class DemoChild implements Demo1,Demo2{  
    public void m1(){
        System.out.println("Child fun");
    }
}

class Client{
    public static void main(String []args){

       DemoChild  obj = new DemoChild();
       obj.m1();                        //may be their is fight ki kiske interface ki default m1 call hogi lekin m1 is written in child 

       Demo1 obj1 = new DemoChild();
       obj1.m1();

       Demo2 obj2 = new DemoChild();    //all output same
       obj2.m1();
    }
}


