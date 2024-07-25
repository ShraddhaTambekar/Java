class Employee{

    int empId = 10;         
    String str = "Shraddha";

    void empInfo(){
        System.out.println("id " + empId);
        System.out.println("name " + str);
    }
}

class MainDemo{
    public static void main(String []args){

        Employee obj = new Employee();
        obj.empInfo();
        System.out.println(obj.empId);    
        System.out.println(obj.str);          
            
    }
}

