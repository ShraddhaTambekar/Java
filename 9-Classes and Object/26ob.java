class Demo{                               

    int x = 10;  

    Demo(){                                   
        System.out.println("no args"); 
    }

    Demo(int x){ 
        System.out.println(x);      //o-20 local variable...thats why it take it as x
        System.out.println(this.x); //o-10  global instance variable                       
        System.out.println("para");
    }
    public static void main(String []args){
        Demo obj1 = new Demo();      
        Demo obj2 = new Demo(20);    
    }
}

