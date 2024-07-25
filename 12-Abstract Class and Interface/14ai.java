interface Demo1{                   //interface is also used when we want functionality from 2 classes(multiple inheritance)
    void fun();                    //abstract class can inherit only 1 class ....interface can implement 
}

interface Demo2{
    void fun();                //interface donot have ambiguity for same name method bcz non of them have body let it inherite both class
}

class DemoChild implements Demo1,Demo2{

    public void fun(){
         System.out.println("in fun child");
     }
    
}
