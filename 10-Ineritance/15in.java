class Parent{                     //Make diagram static in parent class
    
    static int x = 10;   
    int y = 10;        
    
    static {
        System.out.println("in parent static block");
    }
}

class Child extends Parent{   
    
    static {
        System.out.println("in child static block");
        System.out.println(y);   //IMP  //child get parent class all variables and method but kaha se access kiya hai(s,N-s) yeh bhi matter krta hai
    }                              //error: non-static variable y cannot be referenced from a static context
}

class Client{
    public static void main(String []args){

        System.out.println("in main");
        Child obj1 = new Child();               

    }
}


