class Outer{
    class Inner{

        void m1(){
            System.out.println("inner m1");
        }
    }

    void m2(){
        System.out.println("outer m2");
    }

    public static void main(String []args){    //if main is inside outer class
         
        Inner obj = new Outer().new Inner();   //reference is not given bcz main can see inner class
        obj.m1();
    }


}
