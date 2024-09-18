package org.example.foundational;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class VarExample {

    public static void main(String[] args) throws FileNotFoundException {

        //Usage 1:
        var states = List.of("New York","Colorado","San Francisco","New Jersey"); //implies List<String>
        System.out.println(states);

        var methodVariable = 10;
        System.out.println(methodVariable);

        //Usage 2:
        for(var state : states) {
            System.out.println(state);
        }

        //Usage 3:
        try(var stream = new FileInputStream("states.txt")) {
            String state = String.valueOf(stream.read());
            System.out.println(state);
        } catch (IOException e) {
            //throw exception
        }


        //Examples how not to use var:

        // Invalid
        //public void myMethod(var param) { }

        //// Invalid
        //public var myMethod() { }

        // Invalid
        //var field = 10; at the class level it wont work

        // Invalid
        //var uninitialized;



    }
}
