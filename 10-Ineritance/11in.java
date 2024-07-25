class Parent{                                        //make diagram
    Parent(){
        System.out.println("in parent Constructor");
    }

    void parentProperty(){
        System.out.println("Flat,Car,Gold");
    }
}

class Child extends Parent{                         
    Child(){
        System.out.println("in child Constructor");
    }
}

class Client{
    public static void main(String []args){
        Child obj2 = new Child();            //by just making one object of child we can access child class as well as parent class methods
        obj2.parentProperty();
    }
}

