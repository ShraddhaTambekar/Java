class StackDemo{

    static void fun(int x){

        fun(++x);
    }

    public static void main(String []args){

        try{
           fun(1);
        }catch(StackOverflowError obj ){          //error vese bhi handle ni kr skte
            System.out.println("Exception in theard main" + Thread.currentThread().getName() );
            obj.printStackTrace(); 
        }
    }
}