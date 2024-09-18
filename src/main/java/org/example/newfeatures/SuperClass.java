

public class SuperClass {
    SuperClass(String message){

        System.out.println(STR."Hello from SuperClass! : \{message}");
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

void main(){
    new SubClass();
}
