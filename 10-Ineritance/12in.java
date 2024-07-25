class Parent{                             
    Parent(){                                        //Parent(Parent this) but here when child object is made it stores child this
        System.out.println("in parent Constructor");
        System.out.println(this);                    //Child@762efe5d
    }                                                //same as child

    void parentProperty(){
        System.out.println("Flat,Car,Gold");
        System.out.println(this);                    //Child@762efe5d
    }
}

class Child extends Parent{                         
    Child(){
        System.out.println("in child Constructor");
        System.out.println(this);                     //Child@762efe5d
                                                      // in invoke special parent constructor is called with argument this (object address of child )
    }
}

class Client{
    public static void main(String []args){
        Child obj2 = new Child();            //by just making one object of child we can access child class as well as parent class methods
        obj2.parentProperty();

        Parent obj1 =new Parent();
        obj1.parentProperty();

        Parent obj3 =new Parent();           //parent refernce and child object is ok but child refernce and parent object is not ok
        obj3.parentProperty();


    }
}

/*output-
in parent Constructor
Child@762efe5d
in child Constructor
Child@762efe5d
Flat,Car,Gold
Child@762efe5d
in parent Constructor
Parent@5d22bbb7
Flat,Car,Gold
Parent@5d22bbb7
in parent Constructor
Parent@41a4555e
Flat,Car,Gold
Parent@41a4555e */


