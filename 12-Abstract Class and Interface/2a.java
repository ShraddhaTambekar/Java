abstract class Parent{                              

    void career(){         
        System.out.println("doctor");
    }

    abstract void marry();                    
}


class Child extends Parent{

    void marry(){
        System.out.println("child fun");
    }
}

class Client{

    public static void main(String []args){

        Parent obj = new Parent();     //abstract class object cannot be made
        
    }
}
