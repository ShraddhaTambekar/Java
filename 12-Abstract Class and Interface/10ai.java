interface Demo{                         
   
void fun();

void gun();

}

class DemoChild implements Demo{    

    void fun(){                               //error bcz override fun has access specifier public 
        System.out.println("in child fun");
    }

    void gun(){
        System.out.println("in child gun");
    }

}

