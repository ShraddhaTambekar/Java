abstract class Parent{                              

    void career(){         
        System.out.println("doctor");
    }

     void marry(){
         System.out.println("Hello");
    }                   
}

class Client{

    public static void main(String []args){

        Parent obj = new Parent();  // if we have class with all functionality and implimentaion but donot  want its object to be made we write abstract keyword before class
        
    }
}

