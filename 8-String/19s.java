//StringBuffer

class Demo{
    public static void main(String []args){

        StringBuffer sb = new StringBuffer();
        
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("shashi");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());

        sb.append("bagal");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());

        sb.append("core2web");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());

    }
}

/*
1)StringBuffer is mutable,therefore same hashcode...no new object is made same obj is modified
2)StringBuffer Default capacity is 16 character and initial capacity is (initial string +16) here (6+16)
3)when capacity is full it increase capacity with formula (current capacity + 1 )*2
4)String made with String buffer are on heap not in scp
*/

/*
output-
16
1365202186
16
shashibagal
1365202186
16
shashibagalcore2web
1365202186
34
*/
