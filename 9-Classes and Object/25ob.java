class Demo{                               //diagram

    int x = 10;  

    Demo(){                               //x is stored in both constructor..but whos obj is made at a time one will be called
        System.out.println("no args")   
    }

    Demo(int y){                         //x is bipush in both but will get memory in constructor who object is made
        System.out.println("para")
    }
    public static void main(String []args){
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(10); 
    }
}

