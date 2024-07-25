class Demo{
    
    int x = 10;
    static int y = 20;
   
    void fun(){                          //Non ststic context can access anything static/non static      
        System.out.println(x);           //o-10
        System.out.println(y);           //o-20
    }

    public static void main(String []args){

       Demo obj = new Demo();             
       obj.fun();                               

    }

}

