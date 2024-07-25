//stringbuffer in data
//String Class Is Comparable and stringbuffer class is not comparable
//see string class it implements comparable interface...see Integer Float and other rapaer claas all are comparable
//version stable veresion 1.8 hai usme string buffer class is not comparable
//version 1.8 stringbuilder is comparable...further stringbuffer was rewritten

import java.util.*;
class TreeSetDemo{
    public static void main(String []args){

        TreeSet ts = new TreeSet();

        ts.add(new StringBuffer("Kahna"));   //string buffer class cannot be comparable
        ts.add(new StringBuffer("Rahul"));
        ts.add(new StringBuffer("Badhe"));
        ts.add(new StringBuffer("Ashish"));

        System.out.println(ts);
    }
}