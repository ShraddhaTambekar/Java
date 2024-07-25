//Nested inner class           rm *.class              ....similar to inner class
class Outer{                   //Outer.class
    void m1(){

    }

    static class Inner{        //Outer$Inner.class

        void m1(){
            System.out.println("in m1-Inner");
        }

    }          //see it as static int x = 10;

    public static void main(String []args){
          Inner obj = new Inner();
          obj.m1();
    }
}
