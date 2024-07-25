class Parent {                   //make diagram

    int x = 10;
    static int y = 20;

    static {
        System.out.println("Parent static block");
    }

    Parent(){
        System.out.println("in parent constructor");
    }

    void methodOne(){
        System.out.println("in parent instance method");
    }

    static void methodTwo(){
        System.out.println("in parent static method");
    }
}

class Child extends Parent{

    static {
        System.out.println("in child static block");
    }

    Child(){
        System.out.println("in child constructor");
    }

}

class Client{
    public static void main(String []args){

        Child obj = new Child();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.methodOne();
        obj.methodTwo();

    }
}