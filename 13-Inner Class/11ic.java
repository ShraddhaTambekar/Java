class Outer{                        //make diagram
    class Inner{
        void fun2(){                      //inner class has its this and outer class this also means it keep data of outer class also
           System.out.println("in inner fun2");//final Outer this$0; .....its final so that obj1 or obj2 should not change content of outer class
        }
    }

    void fun1(){
        System.out.println("in outer fun1");
    }
}                                          //inner class can access outer class things but could not change it

class Client{
    public static void main(String []args){

        Outer obj = new Outer();           //Outer(obj)

        Outer.Inner obj1 = obj.new Inner();//Outer$Inner(obj1,obj)
        obj1.fun2();

        Outer.Inner obj2 = obj.new Inner();//Outer$Inner(obj2,obj)
        obj2.fun2();

        
    }
}
