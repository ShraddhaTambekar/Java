class Demo{
    public static void main(String []args){

        int x = 3, a = 1, b = 2;
        switch(x){
            case a:                          //error: constant expression required
               System.out.println("a");
               break;
            case b:                            
               System.out.println("b");
               break;
            case a+b:
               System.out.println("a+b");
               break;
            case 4:
               System.out.println("Four");
               break;
            case 5:
               System.out.println("Five");
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
        error: constant expression required
 */

 /*
  1)In swtich constant expression is required
  */