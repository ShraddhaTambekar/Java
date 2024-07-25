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
        obj.fun(10);                    //both parent and child have this type of method but object is of child thats why child method is called       
                        
    }
}



