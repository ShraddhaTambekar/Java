class Parent{       //Return type in overriding...primitive return type has to be (strictly)same...class can be of parent child relation(covariant....bcz parent refence child object worl ,child refernce parnet donot work)

    Object fun(){
        System.out.println("in parent fun");
        return new Object();    //better to return like this without storing  //return new Parent(); also work    }
}                                

class Child extends Parent{

    String fun(){
        System.out.println("child fun");
        return new String();
    }

    void gun(){

    }
}

class Client{
    public static void main(String []args){
        Parent p = new Child();
        p.fun();
        p.gun();


    }
}

/*
 * int          void        Object        Object
 * int (right)  int(wrong)  Object(right) String      (right...covariant return type)
 */
