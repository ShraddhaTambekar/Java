interface Demo1{
    static void fun(){
        System.out.println("in fun static");
    }
    default void gun(){
        System.out.println("in gun Default");
    }
}

interface Demo2{
    static void fun(){
        System.out.println("in fun static");
    }
    default void gun(){
        System.out.println("in gun Default");
    }
}

class DemoChild implements Demo1,Demo2{
    public void gun(){
        System.out.println("in fun DemoChild");
    }

}



class Cllent{
    public static void main(String []args){
        DemoChild obj =  new DemoChild();
        Demo1.fun();
        Demo2.fun();
        obj.gun();
    }
}
