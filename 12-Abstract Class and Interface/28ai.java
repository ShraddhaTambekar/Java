interface Demo1{        

    static void m1(){
        System.out.println("Demo1-m1");
    }
}

interface Demo2 {
    static void m1(){                              //static method in interface donot get override
        System.out.println("Demo2-m1");
    }             
}

class DemoChild implements Demo1,Demo2{  
    void m1(){
        System.out.println("Child fun");
        Demo1.m1();
         Demo2.m1();
    }
}

class Client{
    public static void main(String []args){

       Demo1 obj = new DemoChild();
       obj.m1();                         

       Demo1 obj1 = new DemoChild();
       obj1.m1();

       Demo2 obj2 = new DemoChild();    
       obj2.m1();
    }
}


