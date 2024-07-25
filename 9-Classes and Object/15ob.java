class Demo{               //Types of variable

    int x = 10;           //Instance variable  .....memory in constructor
    static int y = 20;    //Global static variable  .....memory in static block

    void fun(){

        int y = 20;      //local variable  .....gets memory when fun stack is pushed 

    }
}