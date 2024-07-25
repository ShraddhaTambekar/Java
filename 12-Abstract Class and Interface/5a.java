abstract class Parent{                              

    void career(){         
        System.out.println("doctor");
    }

    abstract void marry();                    
}


class Child extends Parent{

    void marry(){
        System.out.println("Kriti Sanon");
    }
}

class Client{

    public static void main(String []args){

        Parent obj = new Child();
        obj.career();
        obj.marry();
        
    }
}

