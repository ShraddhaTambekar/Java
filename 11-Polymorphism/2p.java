class Demo{

    void fun(int x){
         System.out.println("hi");
    }

    float fun(int y){                 //ct error: method fun(int) is already defined in class Demo
        System.out.println("hi");  //return type donot matter in method signature
    }



}
