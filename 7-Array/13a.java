class Demo{

    static void fun(int xarr[]){

        for(float x:xarr){
            System.out.println(x);
        }

    }
    public static void main(String []args){

        int[] arr = {10,20,30,40};

        for(float x:arr){
            System.out.println(x);
        }

        fun(arr);
        
    }
}

/*
 output-
10.0
20.0
30.0
40.0
10.0
20.0
30.0
40.0
 */
