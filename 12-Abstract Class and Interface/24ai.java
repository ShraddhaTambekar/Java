interface Demo{      

    static void m1(){                    //static in interface inheritance tab use krte hai jab sare child ko yehi parent ki implementation dena hai
        System.out.println("Demo1-m1");//interface ke name se call krna hoga
    }
}

class DemoChild implements Demo{  
    
}

class Client{
    public static void main(String []args){

       DemoChild  obj = new DemoChild();
       obj.m1();                        //interface make inheritance and static mai alag chalta hai      
    }
}


