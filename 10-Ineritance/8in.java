class ICC{
    ICC(){
        System.out.println("in ICC constructor");
    }
}

class BCCI extends ICC{                              // bcci constructor 1 st line is invoke special means it will call icci constructor
    BCCI(){
        System.out.println("in BCCI constructor");
    }
}

class Client{
    public static void main(String []args){
        BCCI obj = new BCCI();
    }
}
