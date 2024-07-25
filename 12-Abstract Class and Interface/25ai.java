class Demo{
    static void m1(){                    
        System.out.println("Demo1-m1");
    }
}

class DemoChild extends Demo{  
    
}

class Client{
    public static void main(String []args){

       DemoChild  obj = new DemoChild();
       obj.m1();            //no error bcz we know in class inheritance parent static method come to child             
     }
}



