interface Demo1{               
    void fun();
}

interface Demo2{
    void fun();                
}

interface Demo3{
    void fun();
}

class DemoChild implements Demo1,Demo2,Demo3{

    public void fun(){
         System.out.println("in fun child");
     }
    
}

class Client{
    public static void main(String []args){


    }
}

