interface Demo{                              //inclass static method is inherited in child class but cannot be override ,interface static is not same ,in interface static can be overriden
    static void fun(){                       //public static void fun
        System.out.println("in fun demo");
    }

    default void gun(){                      //public default void gun
        System.out.println("in gun demo");
    }
}


class Client{
    public static void main(String []args){
        
    }
}
