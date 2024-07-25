class Demo{
    
    Demo(){
        System.out.println("no args");
    }

    Demo(int x){
        System.out.println("para");
    }

    Demo(Demo xyz){
        System.out.println("para demo");
    }

    public static void main(String []args){
        Demo obj = new Demo();             //o- no args  //it goes to constructor matching parameter
        Demo obj1 = new Demo(10);        //o- para
        Demo obj2 = new Demo(obj);         //o- para demo

    }
}