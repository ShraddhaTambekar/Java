//Annnoymous inner class(one time use)
class Demo{                                  //Demo.class

}

class Client{                                //Client.class
    public static void main(String []args){
        Demo obj = new Demo(){               //Annomymous inner class....Client$1.class.....constructor Client();.....no this

        };
    }
}