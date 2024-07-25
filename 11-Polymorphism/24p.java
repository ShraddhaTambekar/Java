class Parent{

    final void fun(){                    //Final keyword iis given to parent method when inoverriding parent some method donot want to oveeride 
        System.out.println("Parent fun");
    }
}

class Child extends Parent{

    void fun(){                          //error        
        System.out.println("child fun");  
    }
}

class Client{

    public static void main(String []args){

        Child obj = new Child();
        
    }
}
