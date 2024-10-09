package org.example.newfeatures.flexibleconstructors;

class SuperClass {
    SuperClass(String message){

        System.out.println("Hello from org.example.newfeatures.flexibleconstructors.SuperClass! : " + message);
    }
}

class SubClass extends SuperClass {

    SubClass() {
        String message = "Hello from Subclass";
        prepareMessage();//fail fast
        super(message);
    }

    static String prepareMessage(){
        String message = "Hello from Subclass";
        return message;
    }
}
public class SuperClassMain {
    void main() {
        new SubClass();
    }
}