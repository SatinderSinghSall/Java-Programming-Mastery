// Topic: Java Type Conversions & Type Promotions Explained | Type Casting in Java.
//
// Type Conversion:
// Converting a value from one data type to another data type.
//
// Java Type Conversion is mainly divided into:
//
// 1. Widening Type Conversion
// 2. Narrowing Type Conversion
//
// Type Promotion:
// When Java automatically promotes smaller data types to a larger
// data type while performing operations or expressions.
//
// ------------------------------------------------------------
// 1. WIDENING TYPE CONVERSION
// ------------------------------------------------------------
//
// Widening means:
//
// byte -> short -> int -> long -> float -> double
//
// It is also called:
// Implicit Type Casting / Automatic Type Conversion
//
// No explicit casting is required.
//
// Example:
//
// int number = 100;
// double value = number;
//
// Here, int is automatically converted to double.
//
// ------------------------------------------------------------
// 2. NARROWING TYPE CONVERSION
// ------------------------------------------------------------
//
// Narrowing means converting a larger data type into a smaller
// data type.
//
// It is also called:
// Explicit Type Casting
//
// Explicit casting is required.
//
// Example:
//
// double number = 100.99;
// int value = (int) number;
//
// The decimal part will be removed.
//
// ------------------------------------------------------------
// 3. TYPE PROMOTION
// ------------------------------------------------------------
//
// During arithmetic operations, Java automatically promotes
// smaller data types such as byte, short and char to int.
//
// Example:
//
// byte a = 10;
// byte b = 20;
//
// int result = a + b;
//
// The result of a + b is int, not byte.
//
// ------------------------------------------------------------

public class TypeConversions {

    public static void main(String[] args) {

        System.out.println(
                "Topic: Java Type Conversions & Type Promotions Explained | Type Casting in Java."
        );


        // ============================================================
        // 1. WIDENING TYPE CONVERSION
        // ============================================================

        System.out.println("\n===== 1. Widening Type Conversion =====");

        int intNumber = 100;

        // int automatically converted to double
        double doubleNumber = intNumber;

        System.out.println("Integer value: " + intNumber);
        System.out.println("Double value: " + doubleNumber);


        // byte -> short
        byte byteValue = 10;
        short shortValue = byteValue;

        System.out.println("\nByte value: " + byteValue);
        System.out.println("Short value: " + shortValue);


        // short -> int
        short shortNumber = 1000;
        int integerNumber = shortNumber;

        System.out.println("\nShort value: " + shortNumber);
        System.out.println("Integer value: " + integerNumber);


        // int -> long
        int number = 100000;
        long longNumber = number;

        System.out.println("\nInteger value: " + number);
        System.out.println("Long value: " + longNumber);


        // long -> float
        long largeNumber = 100000L;
        float floatNumber = largeNumber;

        System.out.println("\nLong value: " + largeNumber);
        System.out.println("Float value: " + floatNumber);


        // float -> double
        float decimalNumber = 10.5f;
        double largeDecimalNumber = decimalNumber;

        System.out.println("\nFloat value: " + decimalNumber);
        System.out.println("Double value: " + largeDecimalNumber);


        // ============================================================
        // 2. NARROWING TYPE CONVERSION
        // ============================================================

        System.out.println("\n===== 2. Narrowing Type Conversion =====");

        double price = 99.99;

        // Explicit casting
        int integerPrice = (int) price;

        System.out.println("Original double value: " + price);
        System.out.println("After casting to int: " + integerPrice);


        // Another example

        long longValue = 100000L;

        int intValue = (int) longValue;

        System.out.println("\nLong value: " + longValue);
        System.out.println("After casting to int: " + intValue);


        // ============================================================
        // 3. DECIMAL TO INTEGER
        // ============================================================

        System.out.println("\n===== 3. Decimal to Integer =====");

        double decimalValue = 25.75;

        int convertedValue = (int) decimalValue;

        System.out.println("Decimal value: " + decimalValue);
        System.out.println("Converted integer: " + convertedValue);

        // Output:
        // 25.75
        // 25
        //
        // Important:
        // Casting does NOT round the number.
        // It removes the decimal portion.


        // ============================================================
        // 4. INTEGER TO CHARACTER
        // ============================================================

        System.out.println("\n===== 4. Integer to Character =====");

        int asciiValue = 65;

        char character = (char) asciiValue;

        System.out.println("Integer value: " + asciiValue);
        System.out.println("Character value: " + character);

        // 65 represents 'A' in Unicode.


        // ============================================================
        // 5. CHARACTER TO INTEGER
        // ============================================================

        System.out.println("\n===== 5. Character to Integer =====");

        char letter = 'A';

        int characterValue = letter;

        System.out.println("Character: " + letter);
        System.out.println("Integer value: " + characterValue);


        // ============================================================
        // 6. TYPE PROMOTION WITH BYTE
        // ============================================================

        System.out.println("\n===== 6. Type Promotion with byte =====");

        byte a = 10;
        byte b = 20;

        // byte + byte becomes int
        int result = a + b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + result);


        // This will NOT compile:
        //
        // byte result2 = a + b;
        //
        // Because a + b produces an int.


        // ============================================================
        // 7. TYPE PROMOTION WITH SHORT
        // ============================================================

        System.out.println("\n===== 7. Type Promotion with short =====");

        short x = 100;
        short y = 200;

        int sum = x + y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + sum);


        // ============================================================
        // 8. TYPE PROMOTION WITH CHAR
        // ============================================================

        System.out.println("\n===== 8. Type Promotion with char =====");

        char c1 = 'A';
        char c2 = 'B';

        int charResult = c1 + c2;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + charResult);


        // A = 65
        // B = 66
        // 65 + 66 = 131


        // ============================================================
        // 9. BYTE + INT
        // ============================================================

        System.out.println("\n===== 9. byte + int =====");

        byte byteNumber = 10;
        int integerValue2 = 20;

        int total = byteNumber + integerValue2;

        System.out.println("byte value: " + byteNumber);
        System.out.println("int value: " + integerValue2);
        System.out.println("Result: " + total);


        // ============================================================
        // 10. INT + LONG
        // ============================================================

        System.out.println("\n===== 10. int + long =====");

        int intA = 100;
        long longA = 200L;

        long longResult = intA + longA;

        System.out.println("int value: " + intA);
        System.out.println("long value: " + longA);
        System.out.println("Result: " + longResult);


        // ============================================================
        // 11. INT + FLOAT
        // ============================================================

        System.out.println("\n===== 11. int + float =====");

        int intB = 100;
        float floatB = 20.5f;

        float floatResult = intB + floatB;

        System.out.println("int value: " + intB);
        System.out.println("float value: " + floatB);
        System.out.println("Result: " + floatResult);


        // ============================================================
        // 12. FLOAT + DOUBLE
        // ============================================================

        System.out.println("\n===== 12. float + double =====");

        float floatValue = 10.5f;
        double doubleValue = 20.5;

        double doubleResult = floatValue + doubleValue;

        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("Result: " + doubleResult);


        // ============================================================
        // 13. TYPE PROMOTION ORDER
        // ============================================================

        System.out.println("\n===== 13. Type Promotion Order =====");

        // During binary numeric operations:
        //
        // byte, short, char
        //        ↓
        //       int
        //        ↓
        //      long
        //        ↓
        //      float
        //        ↓
        //     double


        // ============================================================
        // 14. EXPRESSION TYPE PROMOTION
        // ============================================================

        System.out.println("\n===== 14. Expression Type Promotion =====");

        byte p = 10;
        byte q = 20;

        // Both byte values are promoted to int
        int expressionResult = p + q;

        System.out.println("Expression result: " + expressionResult);


        // ============================================================
        // 15. CASTING DURING CALCULATION
        // ============================================================

        System.out.println("\n===== 15. Casting During Calculation =====");

        double value1 = 10.8;
        double value2 = 3.2;

        int result1 = (int) value1 + (int) value2;

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("Result = " + result1);


        // ============================================================
        // 16. INTEGER DIVISION
        // ============================================================

        System.out.println("\n===== 16. Integer Division =====");

        int numerator = 5;
        int denominator = 2;

        int divisionResult = numerator / denominator;

        System.out.println("5 / 2 = " + divisionResult);

        // Result is 2 because both values are integers.


        // ============================================================
        // 17. DOUBLE DIVISION
        // ============================================================

        System.out.println("\n===== 17. Double Division =====");

        double decimalResult = (double) numerator / denominator;

        System.out.println("5 / 2 = " + decimalResult);

        // Result is 2.5


        // ============================================================
        // 18. IMPLICIT vs EXPLICIT CASTING
        // ============================================================

        System.out.println("\n===== 18. Implicit vs Explicit Casting =====");

        // Implicit / Widening

        int smallNumber = 50;
        double widenedNumber = smallNumber;

        System.out.println("Widening:");
        System.out.println("int = " + smallNumber);
        System.out.println("double = " + widenedNumber);


        // Explicit / Narrowing

        double bigDecimal = 50.99;
        int narrowedNumber = (int) bigDecimal;

        System.out.println("\nNarrowing:");
        System.out.println("double = " + bigDecimal);
        System.out.println("int = " + narrowedNumber);


        // ============================================================
        // 19. DATA LOSS DURING NARROWING
        // ============================================================

        System.out.println("\n===== 19. Data Loss During Narrowing =====");

        int originalNumber = 130;

        byte convertedByte = (byte) originalNumber;

        System.out.println("Original int: " + originalNumber);
        System.out.println("Converted byte: " + convertedByte);

        // byte range:
        // -128 to 127
        //
        // 130 is outside the byte range.
        // Therefore, narrowing can cause data loss / unexpected values.


        // ============================================================
        // 20. FINAL COMPLETE EXAMPLE
        // ============================================================

        System.out.println("\n===== 20. Complete Example =====");

        int age = 25;

        // Widening
        double ageAsDouble = age;

        // Narrowing
        double salary = 50000.75;
        int salaryAsInt = (int) salary;

        // Type promotion
        byte marks1 = 80;
        byte marks2 = 90;

        int totalMarks = marks1 + marks2;

        // Character promotion
        char grade = 'A';
        int gradeNumber = grade;

        System.out.println("Age: " + age);
        System.out.println("Age as double: " + ageAsDouble);

        System.out.println("Salary: " + salary);
        System.out.println("Salary as int: " + salaryAsInt);

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Total Marks: " + totalMarks);

        System.out.println("Grade: " + grade);
        System.out.println("Grade Unicode value: " + gradeNumber);


        // ============================================================
        // KEY POINTS TO REMEMBER
        // ============================================================

        // 1. Widening conversion is automatic.
        //
        // 2. Narrowing conversion requires explicit casting.
        //
        // 3. Narrowing may cause data loss.
        //
        // 4. byte, short and char are promoted to int
        //    during most arithmetic operations.
        //
        // 5. If one operand is long, the result is generally long.
        //
        // 6. If one operand is float, the result is generally float.
        //
        // 7. If one operand is double, the result is double.
        //
        // 8. Integer division removes the decimal portion.
        //
        // 9. Casting a double to int removes the fractional portion.
        //
        // 10. char can participate in arithmetic because it has
        //     a numeric Unicode value.
    }
}
