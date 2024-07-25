import java.io.*;
class Demo{
    public static void main(String []args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;

        try{
            x = Integer.parseInt(br.readLine());
        }catch(IOException obj){
            System.out.println("Exception-1");
        }catch(NumberFormatException obj){
            System.out.println("Exception 2");
        }catch(NullPointerException obj){
            System.out.println("Exception 3");
        }catch(Exception obj){
            System.out.println("final exception");
        }
    }
}

//exception table....created when try catch is written
// from to target  exception name 
//throw mai table ni banta