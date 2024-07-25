interface Demo1{                    //between 2 interface we have inheritance 
    void m1();
}

interface Demo2 {
    void m2();                
}

interface Demo3 extends Demo1,Demo2{   //no error bcz no ambiguity bcz no body given in Demo1 and Demo2
    void m3();
}


