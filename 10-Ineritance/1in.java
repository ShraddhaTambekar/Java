class Player{              //Setter and Getter

    private int jerNo = 18;
    private String name = "Virat";

    Player(){
        System.out.println("in const");
    }

    void info(){
        System.out.println(jerNo+ " = " + name);
    }
}

class Client{
    public static void main(String []ars){
        Player obj1 = new Player();          
        obj1.info();

        Player obj2 = new Player();
        obj2.info();
        obj2.name = "Sachin";       //As it is private its not accessible
        obj2.jerNo = 8;             //To do this we use this 

        Player obj3 = new Player();
        obj3.info();
    }
}