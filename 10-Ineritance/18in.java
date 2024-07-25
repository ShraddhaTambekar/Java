class Parent {                   

    int x = 10;
    static int y = 20;

    Parent(){
        System.out.println("in parent constructor");
    }

    void fun(){
        System.out.println("in parent instance method");
    }

    static void run(){
        System.out.println("static-run");
    }
}

class Child extends Parent{

    int x = 100;
    static int y = 200;

    Child(){
        System.out.println("in child constructor");
    }

    void access(){
        System.out.println(x);         //here priority is given to local variable similarly for method
        System.out.println(y);         
    }

}

class Client{
    public static void main(String []args){

        Child obj = new Child();
    }
}

