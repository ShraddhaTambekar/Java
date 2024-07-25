/*String Method8-lastIndexOf
 1)public int indexOf(char ch,int fromIndex);
 2)description-
    a)finds last instance of the character in the given string parameter
    b)parameter(char to find,integer index to start the search)
*/

class Demo{
    public static void main(String []args){

        String str = "Core2web";
        System.out.println(str.lastIndexOf('e',0));
    }
}

/*
 output-
 -1
 */
