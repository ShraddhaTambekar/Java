//Tree Set donot take duplicate data + it give output in sorted manner 

//this code is for non duplicated user defined class sorted data
import java.util.*;
class Movies implements Comparable{

    String movieName = null;
    float totalColl = 0.0f;

    Movies(String moviieName,float totalCall){

        this.movieName = movieName;
        this.totalColl =totalColl;
    }
 
    public int compareTo(Object obj){
        return movieName.compareTo(((Movies)obj).movieName);   //typecasted obj class in Movies  //give sorting in desecending value
    }                                                          //to print in decending order put -movieName.compareTo(((Movies)obj).movieName)
                                                               //1 add further -1 add behid 0 donot add compare with ascii value
    public String toString(){
        return movieName;
    }

}

class TreeSetDemo{
    public static void main(String []args){

        TreeSet ts = new TreeSet();

        ts.add(new Movies("Gadar2",150.00f));      //in treeset 1 st element is just stored not compared
        ts.add(new Movies("OMG2",120.00f));        //2 nd time calls compareTo 
        ts.add(new Movies("Jailer",250.00f));


        System.out.println(ts);

    }
}
