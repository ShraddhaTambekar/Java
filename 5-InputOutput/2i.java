//Scanner class

import java.util.Scanner;
class Demo{                                  
    public static void main(String []args){

        Scanner obj = new Scanner(System.in); //Make the connection of Scanner class with System.in pipe(only need to do once)
                                              //in is final static variable of type Inputstream and also object of Inputstream class...check in System class
                                              //in java everything is obj ...even variables
        System.out.println("Enter your name:");
        String name = obj.next();   //i-A     //next method return type is String 

        System.out.println("Enter your age:");
        String age = obj.next();    //i-21

        System.out.println("My name is:" + name); //o-A
        System.out.println("My age is:" + age);   //o-21

    }
}
