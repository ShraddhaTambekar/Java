class Parent{                     //Make diagram static in parent class
    
    static int x = 10;           
    
    static {
        System.out.println("in parent static block");
    }
}

class Child extends Parent{   
    
    static {
        System.out.println("in child static block");
    }
}

class Client{
    public static void main(String []args){

        System.out.println("in main");
        Child obj1 = new Child();               

    }
}

/*
 * output-
in main
in parent static block
in child static block
 * 
 */


