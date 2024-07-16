//Swtich control statement

class Demo{
    public static void main(String []args){

        int i = 3;
        switch(i){
            case 1:
               System.out.println("one");
            case 2:
               System.out.println("Two");
            case 3:
               System.out.println("Three");
            case 4:
               System.out.println("Four");
            case 5:
               System.out.println("Five");
            default:
               System.out.println("No match"); 
        }

        System.out.println("After Switch");
    }
}
/*
output-
       Three
       Four
       Five
       No match
       After Switch
       
 */

/*
 1)If our expression is not equal to any case then it goes to default
 2)Default case be written anywhere in swtich 
 3)If we donot write break,All the cases after the match of swtich expression will be executed
 */
