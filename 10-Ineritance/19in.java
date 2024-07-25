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

    void access(){                        //similarly we can call parent method having same name as child method using super
        System.out.println(super.x);      //when u have same name variable in parent and child to call parent variable use super keyword
        System.out.println(super.y);      //byte code goes as Parent.x
        System.out.println(x);
        System.out.println(y);
        System.out.println(this.x);       // this came when obj is made
        System.out.println(this.y); 
        System.out.println(this);         //this give address of child
        System.out.println(super);        //but what is super? super is non static....search super refernce is in parent class       
    }

}

class Client{
    public static void main(String []args){

        Child obj = new Child();
    }
}

