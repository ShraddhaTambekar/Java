class Parent{

 void fun(){
        System.out.println("Parent fun");
    }
}

class Child extends Parent{

    private void fun(){                        //         
        System.out.println("child fun");    
    }
}

class Client{

    public static void main(String []args){

        Child obj = new Child();
        
    }
}
