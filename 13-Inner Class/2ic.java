class Hospital{                 //to see bytecode hospital class - javap -c Hospital.claass
    class Doctor{               //to see bytecode doctor class - javap -c Hospital\$Doctor.class
                                //in doctor bytecode we see its constructor call object class constructor 
    }                           //in doctor bytecode constructor added by compiler is parameterized constructior(Hospital)
}
