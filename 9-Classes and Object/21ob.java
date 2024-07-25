class Demo{                   //constructor

    void Demo(){              //when we add void before constructor it no loger remain constructor it become normal method and it will not be implicitly called 
        System.out.println("in constructor");
    }

    public static void main(String []args){
        Demo obj = new Demo();

    }
}

