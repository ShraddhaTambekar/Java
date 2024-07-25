class Parent{

    static void fun(){
        System.out.println("Parent fun");
    }
}

class Child extends Parent{

    static void fun(){                       //here it is method hidding its class method now 
        System.out.println("child fun");   
    }
}

class Client{

    public static void main(String []args){

        Child obj = new Child();
        
    }
}
