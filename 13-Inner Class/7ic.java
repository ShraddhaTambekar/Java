//Nested inner class     
class Outer{                  
    void m1(){

    }

    static class Inner{       

        void m1(){
            System.out.println("in m1-Inner");
        }

    }         
}

class Client{                                    //nested inner class main is in other class

    public static void main(String []args){

          Outer.Inner obj = new Outer.Inner();  
          obj.m1();
    }
}

