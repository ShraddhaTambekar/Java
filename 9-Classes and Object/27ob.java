class Demo{                               

    int x = 10;  

    Demo(){                                   
        System.out.println("no args");  
        System.out.println(this.x);
        System.out.println(x);
    }

    Demo(int x){ 
        this.x = x;// keep 20 in this.x...now it seems like we have changed the value of instance variable lets see if it reflect in Demo()
        this();              //ct error: call to this must be first statement in constructor....it is call to Demo()constructor...this line should be 1 st statement 
        System.out.println(x);      
        System.out.println(this.x);                        
        System.out.println("para");
    }
    public static void main(String []args){
        Demo obj1 = new Demo();      
        Demo obj2 = new Demo(20);    
    }
}


