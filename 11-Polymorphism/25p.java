class Parent{

    static void fun(){
        System.out.println("Parent fun");
    }
}

class Child extends Parent{

    void fun(){                            //static modifier hoga to static parent method ko non static bana diya not allowed bcz its parent class method        
        System.out.println("child fun"); //static to non static static not allowed, non static to static not allowed  
    }                                      //static to static(method hidding)
}

class Client{

    public static void main(String []args){

        Child obj = new Child();
        
    }
}
