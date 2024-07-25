//Method local inner class(when any class that come in picture by calling metod it is known as method local inner class)
class Outer{                                             //Outer.class

    void m1(){
        System.out.println("in m1 outer");

        class Inner{                                     //Outer$1Inner.class ......javap -c Outer$1Inner.class(vs code)....this$0(Outer)
            void m1(){
                System.out.println("in m1 Inner");
            }
        }

        Inner obj = new Inner();
        obj.m1();
    }

    void m2(){
        System.out.println("in m2 outer");
    }

    public static void main(String []args){
        Outer obj = new Outer();
        obj.m1();
        obj.m2();
    }
}