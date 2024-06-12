class Demo{
    public static void main(String []args){

        int x = 5;
        int y = 7;

        boolean ans1 = x<y && y<x;     // For AND both statments are checked and executed
        boolean ans2 = x<y || y<x;     // For OR if 1st statment is true 2nd statment is not even checked and excuted

        System.out.println(ans1);
        System.out.println(ans2);

    }
}