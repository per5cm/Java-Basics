# Data Types in Java

[!TIP] Analogy for Variables and Data Types

    Variable: Think of a variable as a container where you can store different items like books, movie CDs, etc.
    Data Type: The data type specifies what kind of data can be stored in the container. For instance, if the container is designated for books (int), you cannot store a CD (char) in it.

In this analogy:

    An int container (variable) can hold whole numbers.
    A char container can hold a single character.
    A double container can hold decimal numbers.

Java provides several data types to handle different kinds of data. Here are some of the primary data types:

1. int (Integer):
        Description: Stores whole numbers (both positive and negative) without decimal points.
        Size: 4 bytes.
        Range: -2<sup>31</sup> to 2<sup>31</sup> - 1.

        int swag = 10;
        int yolo = 5;

2. char (Character):

    Description: Stores a single 16-bit Unicode character.
    Size: 2 bytes.
    Range: '\u0000' (or 0) to '\uffff' (or 65,535).

    char letter = 'a';

3. double (Double-Precision Floating Point):

    Description: Stores double-precision 64-bit IEEE 754 floating point. Used for decimal values.
    Size: 8 bytes.
    Range: Approximately ±1.79769313486231570E+308 (15 significant decimal digits).

    double value = 20.5;

# Example of Data Type Usage

Here is a sample class that demonstrates the usage of these data types:

    class Example {
        int swag = 10;       // Integer variable
        int yolo = 5;        // Integer variable
        char letter = 'a';   // Character variable
        double amount = 20.5; // Double variable

        void displayValues() {
            System.out.println("swag: " + swag);
           System.out.println("yolo: " + yolo);
            System.out.println("letter: " + letter);
            System.out.println("amount: " + amount);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Example example = new Example();
            example.displayValues();
        }
    }


# Summary

    int: Stores whole numbers, size 4 bytes, range -2<sup>31</sup> to 2<sup>31</sup> - 1.
    char: Stores a single character, size 2 bytes, range '\u0000' to '\uffff'.
    double: Stores decimal numbers, size 8 bytes, range approximately ±1.79769313486231570E+308.

Understanding these data types helps you effectively manage and manipulate different kinds of data in your Java programs.

