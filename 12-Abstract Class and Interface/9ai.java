interface Demo{                            // one interface extends other interface
                                           //one class extends other class 
                                           //one class implements other class
    void fun();                            //when child class object is made which implement interface then child class constructor calls object class constructor

    void gun();
}

class DemoChild implements Demo{    //error: DemoChild is not abstract and does not override abstract method gun() in Demo

}