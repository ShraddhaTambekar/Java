interface Demo1{                              

    default void fun(){                      
        System.out.println("in fun Demo1");
    }
}

interface Demo2{

    default void fun(){
        System.out.println("in fun Demo2");
    }
}

class DemoChild implements Demo1,Demo2{ //error
    
}

class Client{
    public static void main(String []args){
        
    }
}
