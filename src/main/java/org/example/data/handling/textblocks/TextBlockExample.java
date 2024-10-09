package org.example.data.handling.textblocks;

public class TextBlockExample {

    public static void main(String[] args) {
        // Using a traditional string with line breaks and escapes (before text blocks)
        String jsonOld = "{\n" +
                "    \"name\": \"Alice\",\n" +
                "    \"age\": 30,\n" +
                "    \"email\": \"alice@example.com\"\n" +
                "}";

        System.out.println("Old JSON (without text blocks):");
        System.out.println(jsonOld);

        // Using a text block for cleaner and more readable multi-line strings
        String jsonNew = """
                {
                    "name": "Alice",
                    "age": 30,
                    "email": "alice@example.com"
                }
                """;

        System.out.println("\nNew JSON (with text blocks):");
        System.out.println(jsonNew);

        // A SQL query using text blocks
        String sqlQuery =
    """
                SELECT id, name, email
                FROM users
                WHERE age > 25
                ORDER BY name ASC;
             """;

        System.out.println("\nSQL Query using text blocks:");
        System.out.println(sqlQuery);
    }
}
