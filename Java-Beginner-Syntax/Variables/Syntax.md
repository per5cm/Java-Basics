# Summary

    Attributes: Characteristics of an object, defined within a class.
    Variables: Containers for storing data values. Variables need to be declared and can be initialized with values.
    Declaration: Introduces a variable and specifies its type.
    Initialization: Assigns a value to a declared variable.
    Combined Declaration and Initialization: Declares a variable and assigns a value in a single step.

# Attributes and Variables in Java

Attributes:
Attributes (or fields) are characteristics or properties of an object. They define the state of an object.

For example, consider a Person class:

java

class Person {
    String name; // Attribute representing the name of the person
    int age;     // Attribute representing the age of the person
    char sex;    // Attribute representing the sex of the person
}

In this Person class:

    name is a String attribute.
    age is an int attribute.
    sex is a char attribute.

# Variables:
Variables are used to store data that can be manipulated within a program. Variables can be of various types, such as int, float, char, etc.

There are a few important concepts related to variables:

1. Declaration:
Declaring a variable means telling the compiler about the variable's existence and its data type.

    int age; // Declaration of a variable 'age' of type int

2. Initialization:
Initializing a variable means assigning a value to the declared variable.

    age = 22; // Initialization of the variable 'age' with the value 22

3. Combined Declaration and Initialization:
It is also possible to declare and initialize a variable at the same time.

    int number = 47; // Declaration and initialization in a single step

# Example Class with Variables

Here is an example class to illustrate the concepts:

    class Example {
       int age;      // Declaration of an instance variable 'age'
       int number = 47; // Declaration and initialization of an instance variable 'number'
    
        void initializeAge() {
            age = 22; // Initialization of the variable 'age'
        }
    }

In this Example class:

    int age; is a declaration of an instance variable age.
    int number = 47; is both a declaration and initialization of the instance variable number.
    age = 22; within the initializeAge method is an example of initializing the variable age.
