class Parent{
    Parent(){
        System.out.println("in parent Constructor");
    }

    void parentProperty(){
        System.out.println("Flat,Car,Gold");
    }
}

class Child extends Parent{                          //child class get access to methods of parent class also its constructor
    Child(){
        System.out.println("in child Constructor");
    }
}

class Client{
    public static void main(String []args){
        Parent obj1 = new Parent();
        obj1.parentProperty();

        Child obj2 = new Child();           
        obj2.parentProperty();
    }
}

