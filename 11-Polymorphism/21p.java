class Parent{

    public void fun(){
        System.out.println("Parent fun");
    }
}

class Child extends Parent{

    void fun(){                               //Access specifier should be same or should not decrease while overriding
        System.out.println("child fun");    //attempting to assign weaker access privileges; was public
    }
}

class Client{

    public static void main(String []args){

        Child obj = new Child();
        
    }
}