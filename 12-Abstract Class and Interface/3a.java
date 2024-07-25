abstract class Parent{                              

    void career(){         
        System.out.println("doctor");
    }

    abstract void marry();                    
}


abstract class Child extends Parent{

    abstract void marry();               // if child method also donot give body to method then it should also be declared abstract
}

class Client{

    public static void main(String []args){

        Child obj = new Child();
        
    }
}

