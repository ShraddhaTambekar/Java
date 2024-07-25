class Hospital{             
    class Doctor{           //.........level 0  javap -c Hospital\$Doctor.class (linux)........constructor  Hospital$Doctor(Hospital); ....this$0
        class MBBS{         //.........level 1  javap -c Hospital\$Doctor\$MBBS.class(linux)...constructor  Hospital$Doctor$MBBS(Hospital$Doctor); ....this$1:Hospital$Doctor

        }
    }

    class Medical{

    }
}

