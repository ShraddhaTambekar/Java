class Demo{                               

    int x = 10;  

    Demo(){            
        System.out.println("no args");      
    }

    Demo(int x){       
        this();                                      
        System.out.println("para");     //See bytecode ivoke special line give call to Demo(); , this only happens when we call other constructor from one constructor
    }                                     //invokespecial -----<init> means call its own class constructor   
}





