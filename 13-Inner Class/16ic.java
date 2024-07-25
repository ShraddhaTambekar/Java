class Demo{
    void marry(){

    }
}

class Client{
    public static void main(String []args){
        Demo obj = new Demo(){                                  //annoymous inner class has no constructor 
             void marry(){
                System.out.println("in marry of inner class");//annonymous inner class is one time use and use for mainly overridn method in child class
             }

             Demo fun(){
                System.out.println("in fun of inner");
                return new Demo();
             }
        }.fun();
    }
}