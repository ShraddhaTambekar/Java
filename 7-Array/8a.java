//Integer Cache(Only for int and char)

class Demo{
    public static void main(String []args){

        int[] arr ={10,20,30,40};
        int[] arr1 ={10,50,70,80};

        System.out.println(arr);
        System.out.println(System.identityHashCode(arr[0]));
        System.out.println(arr1);
        System.out.println(System.identityHashCode(arr1[0]));
    }
}

/*
 1)Integer Cache- the integer/char ranging from -128 to 127 ,both array see at one 10 integer therefore they have same hashcode
 2)for char range -0 to 127
 */
/*
 output-
I@75a1cd57
1365202186
[I@626b2d4a
1365202186
 */
