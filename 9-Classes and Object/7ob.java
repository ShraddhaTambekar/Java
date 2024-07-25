class Demo{
    int x = 10;
    static int y = 20;

    void fun1(){
        System.out.println(x);
        System.out.println(y);
    }

    static void fun2(){
        System.out.println(x);  //ct error: non-static variable x cannot be referenced from a static context.....object should be made here then we can access it
        System.out.println(y);
    }
}

class Client{
    public static void main(String []args){

        Demo.fun1();           //ct error: non-static method fun1() cannot be referenced from a static context
        Demo.fun2();

    }
}