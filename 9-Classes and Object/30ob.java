class Demo{                               

    int x = 10;  

    Demo(){            
        System.out.println("no args");      //See bytecode invoke special line give call to object class
    }                                         //object------<init> 

    Demo(int x){                                             
        System.out.println("para");         //See bytecode invoke special line give call too object class
    }                                         //object------<init> 
   
}




