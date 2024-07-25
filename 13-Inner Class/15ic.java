//Annnoymous inner 
class Outer{                           
    
    int x = 10;

    void marry(){
        System.out.println("in outer fun1");
    }
}                                          

class Client{
    public static void main(String []args){
                                     // Outer and Client$1 are in parent child relation 
        Outer obj = new Outer(){    //Outer obj = new Client$1(new Outer() is replaced....parent refernce child object.....is init in byte code of client$1.class)
               void marry(){        //in client$1.class ...final class Client$1.class extends demo is their ....final bcz its one time use
                System.out.println("Disha patani");
                System.out.println("");
                fun();             //internal call to fun 
               }
               void fun(){
                System.out.println("in child fun");
               }
        };

        Outer obj1 = new Outer(){

        };
        obj.marry();//in annomyomous inner class only those method can be direct called which are overriden bcz parent refrenec is their
    }               //but we can give internal call pure child method
}    //4 classes are here
//why annoymous class is one time uae class(only born when object of outer is name)