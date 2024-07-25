class Demo{                                      
    public static void main(String []args){            
       
        byte a = 127;                      //no error as 18 is less than 1 byte
        byte b = 132;                     //ct error: incompatible types: possible lossy conversion from int to byte
                                          // as 132 more than 1 byte
    }
}