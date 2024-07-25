class Singleton{
    Singleton(){
        System.out.println("Constructor");
    }

    static Singleton obj = new Singleton();  //static comes 1 st and its fix

    static Singleton getObject(){
        return obj;                         // same object is return.....method is static so that static can be accessed from static
    }
}

class Client{

    public static void main(String []args){
        Singleton obj1 = Singleton.getObject();
        System.out.println(obj1);

        Singleton obj2 = Singleton.getObject();
        System.out.println(obj2);

        Singleton obj3 = Singleton.getObject();
        System.out.println(obj3);


    }
}

