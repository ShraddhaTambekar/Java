class Demo{                   

    int x = 10;

    Demo(){                                  //Demo(Demo this) this datatype is demo ...this has address of obj 
        System.out.println("in constructor");
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(this);            //Demo@123348
    }

    void fun(){                              //fun(Demo this)
        System.out.println(x);               //this.x
        System.out.println(this.x);          //same as x 
        System.out.println(this);            //Demo@123348
    }

    public static void main(String []args){
        Demo obj = new Demo();               //Demo(obj)it calls constructor and give parameter obj(address)
                                             //its hidden therefor its called hidden this refernce
        obj.fun();                           // llly fun(obj)
        System.out.println(obj);             //Demo@123348
    }
}

