class Demo{                               

    private int x = 10;                //see bytecode this private variable is not declared in class just bipush in both constructor 
                                       //access specifier things are done by compiler itself in bytecode

    Demo(){            
        System.out.println("no args");       
    }

    Demo(int x){       
        this();                                      
        System.out.println("para");    
    }   
}





