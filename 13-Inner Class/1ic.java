//inner class
 /*
 1)normal
 2)method local
 3)static inner class(static nested class)
 4)annonymous 
    -normal
    -parametrized annonymous inner class



//Normal Inner class 
/*
 * outer class - Outer.class
 * inner class - 'Outer$Inner.class'
 */
                                         //inner class is not child of outer class see bytecode inner class parent is object class
                                         //inner class while come in picture only when outer clas will come (example room in home )
class Outer{                            //remember when ever we want to access anyclass variable/method we make its object
    class Inner{
        void m1(){
            System.out.println("in m1-inner");
        }
    }

    void m2(){
        System.out.println("in m2-outer");

    }
}

class Client{
    public static void main(String []arga){
        Outer obj = new Outer();            //1st way to make object of inner class outside outer class
        Outer.Inner obj1 = obj.new Inner();     
        obj1.m1();     
        
        Outer.Inner obj2 = new Outer().new Inner(); //2nd way to make object of inner class outside outer class
        obj2.m1();
    }
}