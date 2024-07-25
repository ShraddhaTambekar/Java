abstract class Parent{                              

    void career(){         
        System.out.println("doctor");
    }

    private abstract void marry();    //error                 
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
