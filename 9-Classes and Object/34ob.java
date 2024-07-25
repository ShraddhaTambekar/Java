class Demo{                               

    private int x = 10;                               

    Demo(){            
        System.out.println("no args");       
    }  

    private void fun(){              //see bytecode as fun method is private it is not seen in class
        System.out.println(x);
    }
}

class Demo2{
    public static void main(String []args){
        Demo obj = new Demo();
        obj.fun();
    }
}





