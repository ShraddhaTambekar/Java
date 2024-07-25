class Demo{

    void fun(float x){                                 
        System.out.println("in fun");   
        System.out.println(x);            
    }

    public static void main(String []args){

       Demo obj = new Demo();             
       obj.fun(10);               //o-10.0 This is allowed bcz no data lose                     
       obj.fun(10.05f);           //o-10.5
       obj.fun('A');              //o-65 character go internally as ascii value
       obj.fun(true);             //boolean is 1 bit but true cannot be converted into number in java  
    }

}



