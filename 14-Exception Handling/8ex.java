//try catch and finally
class Demo{
    public static void main(String []args)throws ArithmeticException{      //run time exception ko throw krke bhi koi fayeda ni hai same hee output hoga
        System.out.println("Start main");
        System.out.println(10/0);
        System.out.println("End main");
    }
}