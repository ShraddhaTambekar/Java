import java.util.Scanner;
class Demo{
    public static void main(String []args){

        Scanner obj = new Scanner(System.in); 
        
        System.out.println("Enter your name:");
        String name = obj.next();             

        System.out.println("Enter your age:");
        String age = obj.nextInt();            //ct error:incompatible types: int cannot be converted to String
                                               //nextInt() method return type is int
                                               //To solve - int age = obj.nextInt();
        System.out.println("My name is:" + name);
        System.out.println("My age is:" + age);

    }
}
