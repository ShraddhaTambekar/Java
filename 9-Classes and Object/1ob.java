class Core2web{

    int numCourses = 10;              //default access specifier
    private String favCourse ="java"; //Private access specifier

    void disp(){
        System.out.println(numCourses);//
        System.out.println(favCourse); 
    }
}

class Student{
    public static void main(String []args){

        Core2web obj = new Core2web();
        obj.disp();
        System.out.println(obj.numCourses);    
        System.out.println(obj.favCourse);     //ct  error: favCourse has private access in Core2web
    }
}