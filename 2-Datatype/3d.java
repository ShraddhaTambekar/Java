class Demo{
    public static void main(String [] args){

        byte a = 18;
        byte b = 18;

        a = a+b;                            //ct error: incompatible types: possible lossy conversion from int to byte

        System.out.println(a);
    }
}
