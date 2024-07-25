class Parent{                            //make diagram instance in parent class           

    int x = 10;

    Parent(){
        System.out.println("in parent Constructor");
    }
    
    void access(){
        System.out.println("parent instance");
    }
}

class Child extends Parent{   
    
    int y = 10;

    Child(){
        System.out.println("in child Constructor");
        System.out.println(x);
        System.out.println(y);
    }
}

class Client{
    public static void main(String []args){

        Child obj1 = new Child(); 
        obj1.access();           

    }
}

