class Parent{                     //Make diagram static in parent class
    
    static int x = 10;   

    static {                                            //ptr to special structure of parent is on top of ptr to special structure of child on method area
        System.out.println("in parent static block");
    }

    static void access(){
        System.out.println("in parent static method");
    }
}

class Child extends Parent{   
    
    static {
        System.out.println("in child static block"); 
        System.out.println(x);
        access();    
    }                             
}

class Client{
    public static void main(String []args){

        System.out.println("in main");
        Child obj1 = new Child(); 

    }
}



