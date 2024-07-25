class Parent{

    Parent(){
        System.out.println("Parent Constructor");
    }

    void fun(){
        System.out.println("in fun");
    }
    
}

class Child extends Parent{

    Child(){
        System.out.println("Child Constructor");
    }

    void fun(){
        System.out.println("in child fun");
    }

    void gun(){
        System.out.println("in gun")
    }

}

class Client{
    public static void main(String []args){
        Child obj = new Child();    //compiler only see left side at complie time, right side is done at run time 
        obj.fun();                  //here child fun is called bcz child obj 
        obj.gun();

        Parent obj1 = new Parent(); 
        obj1.fun();                 //here parent fun is called bcz parent obj

        Parent obj2 = new Child();  //refernce is always of that class or its parent  
        obj2.fun();                 //here child fun is called bcz object is of child
        obj2.gun();                 // as we know complier see left side and it do not get gun method therefor error......parent method table donot have gun
    }
}
