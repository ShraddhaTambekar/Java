class Parent{

    Parent(){
        System.out.println("Parent Constructor");
    }

    void fun(int x){
        System.out.println("in parent fun");
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
        obj.fun(10);          //in child fun               
                        
    }
}



