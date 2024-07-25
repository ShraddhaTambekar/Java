class Demo{                            

    static int a = 50;                 //Static variables cannot be initialised inside {}, static block , instance method, static method , main bcz its class variable and global it should be accesed by all ,it cannot be local
                                       //Java supports only global static variable
    {
        static b = 40;                 //ct Error: Can't have modifier 'static' here.
    }

    static {
        static int x = 10;             //ct Error: Can't have modifier 'static' here.
    }

    void fun(){
        static int u = 80;             //ct Error: Can't have modifier 'static' here.
    }

    static void gun(){
        static int n = 70;             //ct Error: Can't have modifier 'static' here.
    }

    public static void main(String []args){
        static y = 10;                 //ct Error: Can't have modifier 'static' here.
    }
}
