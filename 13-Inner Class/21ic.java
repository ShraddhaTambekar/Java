class Outer{
    static class Inner{                //in static inner class no need to make object of inner class
        void m1(){
            System.out.println("in m1");
        }
    }
}

class Client{
    public static void main(String []args){
        
        Outer.Inner obj1 = new Outer.Inner(); //no need to make outer class
        obj1.m1();
    }
}