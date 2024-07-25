class Player{                             //Setter and Getter
                                          //make diagram

    private int jerNo = 0;                //without initiation primitive datatype donot work thats why x is initialised with 0
    private String name = null;

    Player(int jerNo,String name){         //its protocol to use the instance variable name and parameter of constructor to be same
        this.jerNo  = jerNo;               //its a protocol  //make arrow from javastack to obj in diagram 
        this.name = name;                  //Method which help to set data of private instance variable coming from other object is called setter method
        System.out.println("in const");
    }

    void info(){                           //method which help to get data of private instance variable is called getter method
        System.out.println(jerNo+ " = " + name);
    }
}

class Client{
    public static void main(String []ars){
        Player obj1 = new Player(18,"virat");     //Player(obj1,18,"virat")     
        obj1.info();

        Player obj2 = new Player(7,"MSD");        //Player(obj2,7,"MSD")
        obj2.info();

        Player obj3 = new Player(45,"Rohit");     //Player(obj3,45,"Rohit")
        obj3.info();
    }
}

//q) run time string goes in scp or heap(string is immutable if we change in string new object is made so its made on heap)

/*output-in const
18 = virat
in const
7 = MSD
in const
45 = Rohit */
