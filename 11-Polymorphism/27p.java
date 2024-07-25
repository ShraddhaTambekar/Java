class Parent{
                                            ///Method hidding imp code 
    static void fun(){
        System.out.println("Parent fun");
    }
}

class Child extends Parent{

    static void fun(){                               
        System.out.println("child fun");    
    }
}

class Client{

    public static void main(String []args){

        Parent obj1 = new Parent();
        obj1.fun();

        Child obj2 = new Child();
        obj2.fun();

        Parent obj3 = new Child();       // we know when their is parent refernce child object method is called whose object is made but fun is atatic in parent
                                         //we know complier compiler see refernec side at run time here static will not change at ru  time therefore 
        obj3.fun();                      // parent fun
        
    }
}
