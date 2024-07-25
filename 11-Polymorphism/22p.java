class Parent{

    private void fun(){
        System.out.println("Parent fun");
    }
}

class Child extends Parent{

    void fun(){                                //here no error bcz when in ovveriding private is used the above method is private and not seen so cannot be override 
        System.out.println("child fun");      //now so fun of parent is different and child fun is different 
    }
}

class Client{

    public static void main(String []args){

        Child obj = new Child();               //also we have not accesed it if accesed parent fun it give error
        
    }
}
