class Outer{

    Object m1(){                          //Inner m1() not written bcz inner class ka objectni banaya abhi tak

        System.out.println("in outer m1");

        class Inner{                        

            void m1(){
                System.out.println("in m1 inner");
            }

        }
        return new Inner();       

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

/*       // calling method local inner class from here()
        Object obj1 = obj.m1();    //parent refernce and child object
        obj1.m1();                 //as object class domot have m1*/

        obj.m1().m1();      //method chaining//method local inner class bananya hee isiliye hota hai bcz vo inner class tabhi call hoga jab method ayega seen mai so yaha se access krne ka matlab hee ni hai


    }
}

