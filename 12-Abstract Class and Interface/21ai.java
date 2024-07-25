interface Demo{                            
    void gun();

    default void fun(){                      //Default laya hee is liye ki sare child mai common method hai with common body
        System.out.println("in gun demo"); //but deafault can be overriden if not safisgied with body
    }
}

class DemoChild implements Demo{
    public void gun(){
        System.out.println("in gun demoChild");
    }
}

class Client{
    public static void main(String []args){
        Demo obj = new DemoChild();
        obj.gun();
        obj.fun();
    }
}
