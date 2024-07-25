class Demo{                               

    int x = 10;  

    Demo(){        
        this(70);                       //ct error: recursive constructor invocation    
        System.out.println("no args");  
    }

    Demo(int x){ 
        this();                                              
        System.out.println("para");   
    }                                   
    public static void main(String []args){      
        Demo obj2 = new Demo(20);      
    }
}




