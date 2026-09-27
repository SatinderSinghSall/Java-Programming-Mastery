// Topic: Java Operators | Arithmetic + Unary + Logical + Bitwise + Assignment Operators.
//
// ============================================================
// JAVA OPERATORS
// ============================================================
//
// An operator is a symbol that performs an operation on one or
// more operands.
//
// Example:
//
// int a = 10;
// int b = 20;
//
// int result = a + b;
//
// Here:
// +       -> Operator
// a, b    -> Operands
// a + b   -> Expression
//
// ============================================================
//
// TYPES OF OPERATORS IN JAVA
// ============================================================
//
// 1. Arithmetic Operators
// 2. Unary Operators
// 3. Assignment Operators
// 4. Relational Operators
// 5. Logical Operators
// 6. Bitwise Operators
// 7. Shift Operators
// 8. Ternary Operator
// 9. instanceof Operator
//
// ============================================================


public class Operators {

    public static void main(String[] args) {

        System.out.println(
                "Topic: Java Operators | Arithmetic + Unary + Logical + Bitwise + Assignment Operators."
        );


        // ============================================================
        // 1. ARITHMETIC OPERATORS
        // ============================================================
        //
        // Arithmetic operators are used to perform mathematical
        // calculations.
        //
        // +   Addition
        // -   Subtraction
        // *   Multiplication
        // /   Division
        // %   Modulus / Remainder
        //
        // ============================================================

        System.out.println("\n===== 1. Arithmetic Operators =====");

        int a = 20;
        int b = 10;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int remainder = a % b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);


        // ------------------------------------------------------------
        // Arithmetic with decimal numbers
        // ------------------------------------------------------------

        double x = 10.5;
        double y = 2.5;

        System.out.println("\nDecimal Arithmetic:");

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));


        // ------------------------------------------------------------
        // Integer Division
        // ------------------------------------------------------------

        int number1 = 5;
        int number2 = 2;

        System.out.println("\nInteger Division:");
        System.out.println("5 / 2 = " + (number1 / number2));

        // Output:
        // 2
        //
        // Because both operands are integers.


        // ------------------------------------------------------------
        // Modulus Operator
        // ------------------------------------------------------------

        System.out.println("\nModulus:");

        System.out.println("10 % 3 = " + (10 % 3));
        System.out.println("20 % 7 = " + (20 % 7));

        // % gives the remainder.


        // ============================================================
        // 2. UNARY OPERATORS
        // ============================================================
        //
        // Unary operators work on only ONE operand.
        //
        // +   Unary plus
        // -   Unary minus
        // ++  Increment
        // --  Decrement
        // !   Logical NOT
        //
        // ============================================================

        System.out.println("\n===== 2. Unary Operators =====");


        // ------------------------------------------------------------
        // Unary Plus
        // ------------------------------------------------------------

        int positiveNumber = 10;

        System.out.println("Unary Plus: " + (+positiveNumber));


        // ------------------------------------------------------------
        // Unary Minus
        // ------------------------------------------------------------

        int negativeNumber = 10;

        System.out.println("Unary Minus: " + (-negativeNumber));


        // ------------------------------------------------------------
        // Increment Operator
        // ------------------------------------------------------------

        int count = 5;

        count++;

        System.out.println("After increment: " + count);


        // ------------------------------------------------------------
        // Decrement Operator
        // ------------------------------------------------------------

        count--;

        System.out.println("After decrement: " + count);


        // ============================================================
        // 3. PRE-INCREMENT
        // ============================================================
        //
        // ++variable
        //
        // First increment the value.
        // Then use the value.
        //
        // ============================================================

        System.out.println("\n===== 3. Pre-Increment =====");

        int preIncrement = 10;

        int preResult = ++preIncrement;

        System.out.println("Value: " + preIncrement);
        System.out.println("Result: " + preResult);


        // ============================================================
        // 4. POST-INCREMENT
        // ============================================================
        //
        // variable++
        //
        // First use the value.
        // Then increment the value.
        //
        // ============================================================

        System.out.println("\n===== 4. Post-Increment =====");

        int postIncrement = 10;

        int postResult = postIncrement++;

        System.out.println("Result: " + postResult);
        System.out.println("Value after increment: " + postIncrement);


        // ============================================================
        // 5. PRE-DECREMENT
        // ============================================================

        System.out.println("\n===== 5. Pre-Decrement =====");

        int preDecrement = 10;

        int preDecResult = --preDecrement;

        System.out.println("Result: " + preDecResult);
        System.out.println("Value: " + preDecrement);


        // ============================================================
        // 6. POST-DECREMENT
        // ============================================================

        System.out.println("\n===== 6. Post-Decrement =====");

        int postDecrement = 10;

        int postDecResult = postDecrement--;

        System.out.println("Result: " + postDecResult);
        System.out.println("Value after decrement: " + postDecrement);


        // ============================================================
        // 7. ASSIGNMENT OPERATORS
        // ============================================================
        //
        // =     Simple assignment
        // +=    Add and assign
        // -=    Subtract and assign
        // *=    Multiply and assign
        // /=    Divide and assign
        // %=    Modulus and assign
        // &=    Bitwise AND and assign
        // |=    Bitwise OR and assign
        // ^=    Bitwise XOR and assign
        // <<=   Left shift and assign
        // >>=   Right shift and assign
        // >>>=  Unsigned right shift and assign
        //
        // ============================================================

        System.out.println("\n===== 7. Assignment Operators =====");


        // Simple assignment

        int value = 10;

        System.out.println("Initial value: " + value);


        // +=

        value += 5;

        System.out.println("After += 5: " + value);


        // -=

        value -= 3;

        System.out.println("After -= 3: " + value);


        // *=

        value *= 2;

        System.out.println("After *= 2: " + value);


        // /=

        value /= 4;

        System.out.println("After /= 4: " + value);


        // %=

        value %= 3;

        System.out.println("After %= 3: " + value);


        // ============================================================
        // 8. RELATIONAL OPERATORS
        // ============================================================
        //
        // Relational operators compare two values.
        //
        // Result is always boolean: true or false.
        //
        // ==    Equal to
        // !=    Not equal to
        // >     Greater than
        // <     Less than
        // >=    Greater than or equal to
        // <=    Less than or equal to
        //
        // ============================================================

        System.out.println("\n===== 8. Relational Operators =====");

        int p = 20;
        int q = 10;

        System.out.println("p == q : " + (p == q));
        System.out.println("p != q : " + (p != q));
        System.out.println("p > q  : " + (p > q));
        System.out.println("p < q  : " + (p < q));
        System.out.println("p >= q : " + (p >= q));
        System.out.println("p <= q : " + (p <= q));


        // ============================================================
        // 9. LOGICAL OPERATORS
        // ============================================================
        //
        // Logical operators work with boolean expressions.
        //
        // &&    Logical AND
        // ||    Logical OR
        // !     Logical NOT
        //
        // ============================================================


        // ------------------------------------------------------------
        // Logical AND &&
        // ------------------------------------------------------------
        //
        // true && true = true
        // Otherwise = false
        //
        // Both conditions must be true.

        System.out.println("\n===== 9. Logical Operators =====");

        int age = 25;

        boolean hasLicense = true;

        boolean canDrive = age >= 18 && hasLicense;

        System.out.println("Can drive: " + canDrive);


        // ------------------------------------------------------------
        // Logical OR ||
        // ------------------------------------------------------------
        //
        // true || anything = true
        //
        // At least one condition must be true.

        boolean hasCash = false;
        boolean hasCard = true;

        boolean canPay = hasCash || hasCard;

        System.out.println("Can pay: " + canPay);


        // ------------------------------------------------------------
        // Logical NOT !
        // ------------------------------------------------------------

        boolean isRaining = false;

        System.out.println("Is raining: " + isRaining);
        System.out.println("Is NOT raining: " + !isRaining);


        // ============================================================
        // 10. SHORT-CIRCUIT OPERATORS
        // ============================================================
        //
        // && and || are called short-circuit logical operators.
        //
        // &&:
        // If the first condition is false, Java may not evaluate
        // the second condition.
        //
        // ||:
        // If the first condition is true, Java may not evaluate
        // the second condition.
        //
        // ============================================================

        System.out.println("\n===== 10. Short-Circuit Operators =====");

        int shortValue = 10;

        boolean shortCircuitAnd =
                shortValue > 20 && shortValue++ > 5;

        System.out.println("AND result: " + shortCircuitAnd);
        System.out.println("Value: " + shortValue);


        boolean shortCircuitOr =
                shortValue > 5 || shortValue++ > 100;

        System.out.println("OR result: " + shortCircuitOr);
        System.out.println("Value: " + shortValue);


        // ============================================================
        // 11. BITWISE OPERATORS
        // ============================================================
        //
        // Bitwise operators work directly with bits.
        //
        // &    Bitwise AND
        // |    Bitwise OR
        // ^    Bitwise XOR
        // ~    Bitwise Complement
        //
        // These operators are mainly used with integral types.
        //
        // ============================================================

        System.out.println("\n===== 11. Bitwise Operators =====");

        int bitA = 5;
        int bitB = 3;

        //
        // 5 = 0101
        // 3 = 0011
        //


        // ------------------------------------------------------------
        // Bitwise AND &
        // ------------------------------------------------------------
        //
        // 0101
        // 0011
        // ----
        // 0001
        //
        // Result = 1

        System.out.println("5 & 3 = " + (bitA & bitB));


        // ------------------------------------------------------------
        // Bitwise OR |
        // ------------------------------------------------------------
        //
        // 0101
        // 0011
        // ----
        // 0111
        //
        // Result = 7

        System.out.println("5 | 3 = " + (bitA | bitB));


        // ------------------------------------------------------------
        // Bitwise XOR ^
        // ------------------------------------------------------------
        //
        // 0101
        // 0011
        // ----
        // 0110
        //
        // Result = 6

        System.out.println("5 ^ 3 = " + (bitA ^ bitB));


        // ------------------------------------------------------------
        // Bitwise Complement ~
        // ------------------------------------------------------------

        System.out.println("~5 = " + (~bitA));


        // ============================================================
        // 12. SHIFT OPERATORS
        // ============================================================
        //
        // <<    Left shift
        // >>    Signed right shift
        // >>>   Unsigned right shift
        //
        // ============================================================

        System.out.println("\n===== 12. Shift Operators =====");

        int shiftValue = 8;


        // ------------------------------------------------------------
        // Left Shift <<
        // ------------------------------------------------------------
        //
        // 8  = 1000
        //
        // 8 << 1
        //
        // 10000 = 16
        //

        System.out.println("8 << 1 = " + (shiftValue << 1));


        // ------------------------------------------------------------
        // Right Shift >>
        // ------------------------------------------------------------
        //
        // 8 >> 1 = 4
        //

        System.out.println("8 >> 1 = " + (shiftValue >> 1));


        // ------------------------------------------------------------
        // Unsigned Right Shift >>>
        // ------------------------------------------------------------

        System.out.println("8 >>> 1 = " + (shiftValue >>> 1));


        // ============================================================
        // 13. TERNARY OPERATOR
        // ============================================================
        //
        // Syntax:
        //
        // condition ? valueIfTrue : valueIfFalse;
        //
        // It is a short form of if-else.
        //
        // ============================================================

        System.out.println("\n===== 13. Ternary Operator =====");

        int studentMarks = 75;

        String resultStatus =
                studentMarks >= 40 ? "Pass" : "Fail";

        System.out.println("Marks: " + studentMarks);
        System.out.println("Result: " + resultStatus);


        // ------------------------------------------------------------
        // Another ternary example
        // ------------------------------------------------------------

        int number = 15;

        String evenOdd =
                number % 2 == 0 ? "Even" : "Odd";

        System.out.println("Number: " + number);
        System.out.println("Number is: " + evenOdd);


        // ============================================================
        // 14. NESTED TERNARY OPERATOR
        // ============================================================

        System.out.println("\n===== 14. Nested Ternary =====");

        int marks = 85;

        String grade =
                marks >= 90 ? "A+" :
                        marks >= 80 ? "A" :
                                marks >= 70 ? "B" :
                                        marks >= 60 ? "C" :
                                                marks >= 40 ? "D" :
                                                        "F";

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);


        // ============================================================
        // 15. instanceof OPERATOR
        // ============================================================
        //
        // instanceof checks whether an object belongs to a particular
        // class or implements a particular interface.
        //
        // Result is boolean.
        //
        // Syntax:
        //
        // object instanceof ClassName
        //
        // ============================================================

        System.out.println("\n===== 15. instanceof Operator =====");

        String name = "Satinder";

        boolean isString = name instanceof String;

        System.out.println("Is name a String? " + isString);


        // ============================================================
        // 16. STRING CONCATENATION WITH +
        // ============================================================
        //
        // + also works as String concatenation.
        //
        // ============================================================

        System.out.println("\n===== 16. String Concatenation =====");

        String firstName = "Satinder";
        String lastName = "Singh";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);


        // ============================================================
        // 17. + WITH STRING AND NUMBER
        // ============================================================

        System.out.println("\n===== 17. String + Number =====");

        int userAge = 25;

        System.out.println("Age: " + userAge);

        // String + number converts the number to String
        // for concatenation.


        // ============================================================
        // 18. OPERATOR PRECEDENCE
        // ============================================================
        //
        // Operator precedence determines the order in which
        // operators are evaluated.
        //
        // General order:
        //
        // 1. Parentheses              ()
        // 2. Unary                    ++ -- + - !
        // 3. Multiplication           * / %
        // 4. Addition/Subtraction     + -
        // 5. Shift                    << >> >>>
        // 6. Relational               < > <= >= instanceof
        // 7. Equality                 == !=
        // 8. Bitwise AND              &
        // 9. Bitwise XOR              ^
        // 10. Bitwise OR              |
        // 11. Logical AND             &&
        // 12. Logical OR              ||
        // 13. Ternary                 ?:
        // 14. Assignment              = += -= *= etc.
        //
        // Parentheses can be used to explicitly control the order.
        //
        // ============================================================

        System.out.println("\n===== 18. Operator Precedence =====");

        int precedenceResult = 10 + 5 * 2;

        System.out.println("10 + 5 * 2 = " + precedenceResult);

        // Multiplication happens before addition.
        //
        // 5 * 2 = 10
        // 10 + 10 = 20


        // Using parentheses

        int parenthesesResult = (10 + 5) * 2;

        System.out.println("(10 + 5) * 2 = " + parenthesesResult);


        // ============================================================
        // 19. COMBINING MULTIPLE OPERATORS
        // ============================================================

        System.out.println("\n===== 19. Multiple Operators =====");

        int valueA = 10;
        int valueB = 5;
        int valueC = 2;

        int calculation =
                valueA + valueB * valueC;

        System.out.println(
                "10 + 5 * 2 = " + calculation
        );


        // ============================================================
        // 20. PRACTICAL EXAMPLE
        // ============================================================

        System.out.println("\n===== 20. Practical Example =====");

        int studentAge = 20;
        int studentMarksNew = 85;

        boolean eligible =
                studentAge >= 18 && studentMarksNew >= 40;

        String admissionResult =
                eligible ? "Eligible" : "Not Eligible";

        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Marks: " + studentMarksNew);
        System.out.println("Eligible: " + eligible);
        System.out.println("Result: " + admissionResult);


        // ============================================================
        // 21. EVEN / ODD USING MODULUS
        // ============================================================

        System.out.println("\n===== 21. Even / Odd =====");

        int checkNumber = 24;

        if (checkNumber % 2 == 0) {
            System.out.println(checkNumber + " is Even");
        } else {
            System.out.println(checkNumber + " is Odd");
        }


        // ============================================================
        // 22. SWAPPING TWO NUMBERS USING ARITHMETIC OPERATORS
        // ============================================================

        System.out.println("\n===== 22. Swapping Numbers =====");

        int first = 10;
        int second = 20;

        System.out.println("Before swapping:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After swapping:");
        System.out.println("first = " + first);
        System.out.println("second = " + second);


        // ============================================================
        // 23. BITWISE XOR SWAPPING
        // ============================================================

        System.out.println("\n===== 23. XOR Swapping =====");

        int num1 = 10;
        int num2 = 20;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        // ============================================================
        // 24. BITWISE CHECK FOR ODD / EVEN
        // ============================================================
        //
        // For positive integers:
        //
        // n & 1 == 0 -> Even
        // n & 1 == 1 -> Odd
        //
        // ============================================================

        System.out.println("\n===== 24. Bitwise Even / Odd =====");

        int bitNumber = 15;

        if ((bitNumber & 1) == 0) {
            System.out.println(bitNumber + " is Even");
        } else {
            System.out.println(bitNumber + " is Odd");
        }


        // ============================================================
        // 25. FINAL OPERATOR SUMMARY
        // ============================================================

        System.out.println("\n===== 25. Operator Summary =====");

        System.out.println("Arithmetic: + - * / %");

        System.out.println("Unary: + - ++ -- !");

        System.out.println("Assignment: = += -= *= /= %=");

        System.out.println("Relational: == != > < >= <=");

        System.out.println("Logical: && || !");

        System.out.println("Bitwise: & | ^ ~");

        System.out.println("Shift: << >> >>>");

        System.out.println("Ternary: ? :");

        System.out.println("Type Checking: instanceof");


        // ============================================================
        // IMPORTANT POINTS TO REMEMBER
        // ============================================================
        //
        // 1. + can perform addition or String concatenation.
        //
        // 2. % returns the remainder.
        //
        // 3. ++ increases a value by 1.
        //
        // 4. -- decreases a value by 1.
        //
        // 5. ++a is pre-increment.
        //
        // 6. a++ is post-increment.
        //
        // 7. && and || are short-circuit logical operators.
        //
        // 8. & and | can work as bitwise operators.
        //
        // 9. == compares primitive values.
        //
        // 10. For objects, == compares references, not object contents.
        //
        // 11. equals() is commonly used to compare String contents.
        //
        // 12. Ternary operator is a compact alternative to simple
        //     if-else expressions.
        //
        // 13. Parentheses can make expressions clearer and control
        //     evaluation order.
        //
        // 14. instanceof is used for object type checking.
        //
        // 15. Bitwise operators operate at the binary/bit level.
    }
}
