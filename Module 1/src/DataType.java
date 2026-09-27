// Topic: Variables and Data Types
//
// Variable:
// A variable is a named memory location used to store data.
//
// Syntax:
// dataType variableName = value;
//
// Example:
// int age = 25;
//
// Data Types in Java:
//
// 1. byte    - 1 byte  - stores small integer values
// 2. short   - 2 bytes - stores small integer values
// 3. int     - 4 bytes - stores integer values
// 4. long    - 8 bytes - stores large integer values
// 5. float   - 4 bytes - stores decimal values
// 6. double  - 8 bytes - stores larger decimal values
// 7. char    - 2 bytes - stores a single character
// 8. boolean - 1 bit*  - stores true or false
//
// Non-Primitive Data Types:
// String, Array, Class, Object, Interface, etc.

public class DataType {

    public static void main(String[] args) {

        System.out.println("===== Variables and Data Types =====");

        // --------------------------------------------------
        // 1. byte
        // --------------------------------------------------
        byte age = 25;

        System.out.println("\nByte:");
        System.out.println("Age = " + age);


        // --------------------------------------------------
        // 2. short
        // --------------------------------------------------
        short year = 2026;

        System.out.println("\nShort:");
        System.out.println("Year = " + year);


        // --------------------------------------------------
        // 3. int
        // --------------------------------------------------
        int salary = 50000;

        System.out.println("\nInteger:");
        System.out.println("Salary = " + salary);


        // --------------------------------------------------
        // 4. long
        // --------------------------------------------------
        long population = 1_400_000_000L;

        System.out.println("\nLong:");
        System.out.println("Population = " + population);


        // --------------------------------------------------
        // 5. float
        // --------------------------------------------------
        float height = 5.9f;

        System.out.println("\nFloat:");
        System.out.println("Height = " + height);


        // --------------------------------------------------
        // 6. double
        // --------------------------------------------------
        double price = 999.99;

        System.out.println("\nDouble:");
        System.out.println("Price = " + price);


        // --------------------------------------------------
        // 7. char
        // --------------------------------------------------
        char grade = 'A';

        System.out.println("\nCharacter:");
        System.out.println("Grade = " + grade);


        // --------------------------------------------------
        // 8. boolean
        // --------------------------------------------------
        boolean isStudent = true;

        System.out.println("\nBoolean:");
        System.out.println("Is Student = " + isStudent);


        // --------------------------------------------------
        // 9. String
        // --------------------------------------------------
        String name = "Satinder";

        System.out.println("\nString:");
        System.out.println("Name = " + name);


        // --------------------------------------------------
        // Multiple Variables
        // --------------------------------------------------
        String city = "Chennai";
        int age2 = 25;
        double accountBalance = 25000.50;
        boolean isLoggedIn = true;

        System.out.println("\n===== Multiple Variables =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age2);
        System.out.println("City: " + city);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Logged In: " + isLoggedIn);


        // --------------------------------------------------
        // Variable Declaration and Assignment
        // --------------------------------------------------

        // Declaration
        int marks;

        // Assignment
        marks = 85;

        System.out.println("\nMarks = " + marks);


        // --------------------------------------------------
        // Changing Variable Value
        // --------------------------------------------------

        int number = 10;

        System.out.println("\nBefore changing:");
        System.out.println("Number = " + number);

        number = 20;

        System.out.println("After changing:");
        System.out.println("Number = " + number);


        // --------------------------------------------------
        // Constants
        // --------------------------------------------------
        // final is used to create a constant.
        // Its value cannot be changed after assignment.

        final double PI = 3.14159;

        System.out.println("\nConstant:");
        System.out.println("PI = " + PI);


        // --------------------------------------------------
        // Arithmetic with Variables
        // --------------------------------------------------

        int a = 10;
        int b = 20;

        int sum = a + b;
        int difference = b - a;
        int multiplication = a * b;
        int division = b / a;

        System.out.println("\n===== Arithmetic with Variables =====");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);


        // --------------------------------------------------
        // Type Casting
        // --------------------------------------------------

        // Widening Casting
        // Smaller data type -> Larger data type

        int intValue = 100;
        double doubleValue = intValue;

        System.out.println("\n===== Type Casting =====");
        System.out.println("Integer value = " + intValue);
        System.out.println("Double value = " + doubleValue);


        // Narrowing Casting
        // Larger data type -> Smaller data type
        // Explicit casting is required.

        double decimalValue = 100.99;
        int integerValue = (int) decimalValue;

        System.out.println("Decimal value = " + decimalValue);
        System.out.println("Integer after casting = " + integerValue);


        // --------------------------------------------------
        // Character Example
        // --------------------------------------------------

        char firstLetter = 'S';

        System.out.println("\n===== Character =====");
        System.out.println("First Letter = " + firstLetter);


        // --------------------------------------------------
        // Boolean Example
        // --------------------------------------------------

        int marks2 = 75;
        boolean passed = marks2 >= 40;

        System.out.println("\n===== Boolean Example =====");
        System.out.println("Marks = " + marks2);
        System.out.println("Passed = " + passed);


        // --------------------------------------------------
        // Final Example
        // --------------------------------------------------

        System.out.println("\n===== Complete Example =====");

        String studentName = "Satinder";
        int studentAge = 25;
        char studentGrade = 'A';
        double studentPercentage = 85.50;
        boolean studentPassed = true;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student Percentage: " + studentPercentage);
        System.out.println("Student Passed: " + studentPassed);
    }
}
