class Demo{
    public static void main(String []args){

        char ch = 3;
        switch(ch){                            
            case 1:
               System.out.println("one");
               break;
            case 'A':                            
               System.out.println("A");
               break;
            case 'B':
               System.out.println("B");
               break;
            case 'C':
               System.out.println("C");
               break;
            case 57908:
               System.out.println("57908");
               break;
            default:
               System.out.println("No match"); 
               break;
        }
        

        System.out.println("After Switch");
    }
}

/*
 output- 
        No match
        After Switch
 */

/*
 1)int is converted in charactor
 */
