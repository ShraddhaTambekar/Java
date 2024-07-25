//Multidimentional array (2d array)

class Demo{
    public static void main(String []args){

        int[][] arr = new int[4][3];
        int[][] arr1 = {{1,2,3},{4,5,6}}; 
        int[][] arr2 = new int[][]{{1,2,3},{4,5,6}};

        int[][] arr4 = new int[3][3];
        arr4[0][0]=1;
        arr4[0][1]=2;
        arr4[0][2]=3;
        arr4[1][0]=4;
        arr4[1][1]=5;
        arr4[1][2]=6;

        int[][] arr5 = new int[3][];
        arr5[0] = new int[]{1,2,3};
        arr5[1] = new int[]{4,5,6};
        arr5[2] = new int[]{7,8,9};



        System.out.println(arr.length);
    }
}

/*
 1)int[][] arr = new int[row][col]
 2)array length is no. of row
 */

