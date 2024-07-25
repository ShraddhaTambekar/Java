class Demo{                               

    int x = 10;  

    Demo(){                                   
        System.out.println("no args");  
    }

    Demo(int x){ 
        this();                         //this(); is used to call other constructor using only one object          
        System.out.println("para");   //this done to save memory as to call another constructor we need not need to make object to call other constructor
    }                                   //as there is this(); thats why in a obj we have all constructor
                                        //This can only be written in constructor and instance method
    public static void main(String []args){      
        Demo obj2 = new Demo(20);     //Using 1 object 2 constructor are called 
    }
}



