//bolyar plate code
class Demo{
    Demo(){
        System.out.println("in Demo Constructor");
    }
}

class DemoChild extends Demo{
    DemoChild(){
        System.out.println("in DemoChild Constructor");
    }
}

class Parent{
    Parent(){
        System.out.println("in Parent Demo");
    }

    Demo m1(){
        System.out.println("In Parent m1 method");
        return new Demo();
    }
}

class Child extends Parent{
    Child(){
        System.out.println("in Child Constructor");
    }

    DemoChild m1(){                         //covariant return type with user defined class
        System.out.println("in Child m1");
        return new DemoChild();
    }
}

class Client{
    public static void main(String []args){
        Parent p = new Child();
        p.m1();
    }
}
/* 
in Parent Demo
in Child Constructor
in Child m1
in Demo Constructor
in DemoChild Constructor
*/

