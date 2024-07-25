class Demo{

    void fun(int x){
         System.out.println("hi");
    }

    void fun(int y){                 //ct error: method fun(int) is already defined in class Demo
        System.out.println("hi");  //same method signature
    }



}