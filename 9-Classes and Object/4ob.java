class Employee{

    int empId = 10;         
    String name = "Shraddha";
    static int y = 50;

    void empInfo(){
        System.out.println("id " + empId);
        System.out.println("name " + name);
        System.out.println(y);
    }
}

class MainDemo{
    public static void main(String []args){

        Employee obj1 = new Employee();          
        Employee obj2 = new Employee();

        obj1.empInfo();
        obj2.empInfo();

        obj2.empId = 20;                      //Changes made in instance variable by one obj is not seen by other obj
        obj2.name = "Radha";
        obj2.y = 5000;                        //Changes made in static variable by one obj is seen by all obj 

        obj1.empInfo();
        obj2.empInfo();

    }
}

