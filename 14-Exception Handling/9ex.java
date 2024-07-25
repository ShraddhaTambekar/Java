class Demo{
    public static void main(String []args){    

        System.out.println("Start main");

        try{                        //see down in code             //risky code written inside try

        System.out.println(10/0);                        //try ke andar ka code max 2-3 liine ka hona chahiye

        }catch(ArithmeticException obj){  //catch is special function it is in Exception table   //handler code written inside catch

        System.out.println("Exception aya");
        }

        System.out.println("End main");

    }
}

//in try line which has exception throws exception object and that is catch by matching catch
// but agar code mai bohot exception honge toh isiliye catch mai most log (Exception obj) esa likhte hai
//bcz child object and parent reference chalta hai.....but its ot good thing we should know which exception is thrown

//exception table is in last of bytecode and in jvm it is in method area