class Parent{
    Parent(){
        System.out.println("in parent Constructor");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("in child Constructor");
    }
}

class Client{
    public static void main(String []args){
        Parent obj1 = new Parent();
        Child obj2 = new Child();
    }
}
