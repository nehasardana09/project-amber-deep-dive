package org.example.controlflow.switchexpression;

public class SwitchExpressionsMain {
    public void main() {
        System.out.println(getFruit("RED"));
    }

    public String getFruit(String color){
        String fruit = switch (color){
            case "RED" -> "Apple";
            case "YELLOW" -> "Banana";
            case "ORANGE" -> "Orange";
            default -> "Unknown fruit";
        };
        System.out.println(STR."Color: \{color},Fruit: \{fruit}");
        return fruit;
    }
}
