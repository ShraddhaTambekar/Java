abstract class Parent{                              

    void career(){                     //concrete method
        System.out.println("doctor");
    }

    abstract void marry();                     //abstract method..if one method is also abstarct then then we need to write abstract class
}


class Child extends Parent{

    void marry(){
        System.out.println("child fun");
    }
}

class Client{

    public static void main(String []args){

        Child obj = new Child();
        
    }
}