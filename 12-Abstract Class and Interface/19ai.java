interface Demo1{     mat kro yeh code 24 ai.java same hai

    void fun();
    static void m1(){
        System.out.println("Demo1-m1");
    }
}

interface Demo2 {
    static void m1(){
        System.out.println("Demo2-m1");
    }             
}

interface Demo3 extends Demo1,Demo2{  
}

class DemoChild implements Demo3{
    public static void main(String []args){

       Demo1  obj = new DemoChild();
       obj.m1();

    }
}


