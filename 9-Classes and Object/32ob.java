class Demo{                               

    int x = 10;  

    Demo(){            
        System.out.println("no args");     
    }                                          

    Demo(int x){     
        this();
        super();                       //ct error: call to super must be first statement in constructor                                       
        System.out.println("para");  //error occur bcz both super() means call parent class constructor and this() means call its class constructor 
                                       //At a time only one can happen      
    }                                         
   
}





