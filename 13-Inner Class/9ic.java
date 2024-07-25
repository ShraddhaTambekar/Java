class Outer{                          //inner class bytecode in not present in outer class bytecode
    class Inner{                      //but inner class bytecode constructor has Outer as parameter...
        void m1(){                    //outer class goes to jvm as normal class but inner class parametrised constructor and this is their
            System.out.println("in m1-inner");
        }                             //Outer class Constructor has 1 parameter this but inner class constructor has 2 parameter this and outer class
    }                                 //Outer$Inner(Outer$Inner this,Outer this$0);....inner class constructor

    void m2(){                        
        System.out.println("in m2-outer");

    }
}

class Client{
    public static void main(String []arga){
                
        Outer.Inner obj2 = new Outer().new Inner();  //Outer$Inner(obj,new Outer());
        obj2.m1();
    }
}
