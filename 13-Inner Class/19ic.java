class Outer{//method local inner class

    void m1(){

        System.out.println("in outer m1");

        class Inner{                         //Outer$1Inner.class

            void m1(){
                System.out.println("in m1 inner");
            }

        }
        Inner obj = new Inner();
        obj.m1();    //we can call m1 like this

    }

    void m2(){
        System.out.println("in oyter m2");
    }

}

class Client{
    public static void main(String []args){
        Outer obj = new Outer();
        obj.m1();
        obj.m2();
    }


