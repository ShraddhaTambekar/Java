class Demo{
    public static void main(String []args){

        int y = 7;
        int x = -7;

        System.out.println(y>>2);   //1
        System.out.println(y>>>3);  //1  The value for +ve number bitwise operator ryt shift is same as zero fill ryt or left shift
   
        System.out.println(x>>2);   //-2 Just shift right side and donot disturb sign bit (for -ve its 1 for +ve its 0) 
        System.out.println(x>>>2);  //1073741822  Shift right but change sign bit to 0...therefor +ve
        System.out.println(x>>>31); //1
    }
}
