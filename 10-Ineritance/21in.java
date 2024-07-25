class Parent1{                       //multiple inheritance not suported
                                     // if their is same name variable in both parent then which one will be called therefor ambiguity
}

class Parent2{

}

class Child extends Parent1,Parent2{

}

//imp question if A class extends B class then B class is parent of A but by default object class is 
//parent of all classes then object class is also parent of A then its multiple inheritance?
//ans - when our class extence some class other than object class then , object class donot remian direct parent of our class
