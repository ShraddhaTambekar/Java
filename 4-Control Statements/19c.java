//Break
/*
 Q)From 1 to 40 if 3 and 5 divisible by then stop until print(i)
 */
class Demo{
    public static void main(String []args){

         for(int i = 1;i<=40;i++){
            if(i%3==0&&i%5==0){
                break;
            }

         System.out.println(i);   
         }
    }
}

/*
 output-
1
2
3
4
5
6
7
8
9
10
11
12
13
14
 */