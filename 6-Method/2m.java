class Demo{
    public static void main(String []args){ //Ststic method can call static method and variables directly
       fun();
       gun();                               //ct error: non-static method gun() cannot be referenced from a static context
    }

    static void fun(){                           //Static methods/variables are called class methods/variables
        System.out.println("In fun method");
    }

    void gun(){                                  //Non static methods/variables are called object methods/variables
        System.out.println("In gun Method");
    }

}  
