package org.example.future;

// Define the Person record
record Person(String name, int age, String email) {}

public class DerivedRecord {

    public static void main(String[] args) {
        // Original Person record
        Person originalPerson = new Person("Alice", 30, "alice@example.com");
        System.out.println("Original Person: " + originalPerson);

        // Using derived record creation to update the email only
       // Person updatedPerson = originalPerson with {
       //     email = "alice.new@example.com";
       // };
       // System.out.println("Updated Person with new email: " + updatedPerson);

        // Using derived record creation to update the age and email
       // Person agedPerson = updatedPerson with {
        //    age += 1;
        //    email = "alice.updated@example.com";
        //};
        //System.out.println("Person with updated age and email: " + agedPerson);

        // Chaining derived record creation expressions
      //  Person chainedPerson = agedPerson
      //  with { name = "Alice Smith"; }
      //  with { age = 35; };
      //  System.out.println("Person after chaining: " + chainedPerson);
    }
}
