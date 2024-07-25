class Player{              //Setter and Getter

    private int jerNo = 18;
    private String name = "Virat";

    Player(){
        System.out.println("in const");
        System.out.println(this);
    }

    void info(){
        System.out.println(jerNo+ " = " + name);
    }
}

class Client{
    public static void main(String []ars){ //address of this is different because of different obj
        Player obj1 = new Player();             
        obj1.info();                       //in const
                                           //Player@4926097b
                                           //18 = Virat

        Player obj2 = new Player();
        obj2.info();                       //in const
                                           //Player@6842775d
                                           //18 = Virat

        Player obj3 = new Player();
        obj3.info();                       //in const
                                           // Player@574caa3f
                                           //18 = Virat
    }
}
