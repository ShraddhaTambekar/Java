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

    void fun(int x){
        System.out.println("in child fun");
    }

}

class Client{
    public static void main(String []args){
                 
        Parent obj = new Child();    
        obj.fun();                 //as this type of method is their in child class but it need to check this method in parent also as reference is of parent         
                        
    }
}


