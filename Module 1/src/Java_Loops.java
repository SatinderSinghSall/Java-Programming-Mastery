// Topic: Java Loops & Jump Statements
// for, while, do-while, break, continue Explained

public class Java_Loops {

    public static void main(String[] args) {

        System.out.println(
                "Topic: Java Loops & Jump Statements | for, while, do-while, break, continue Explained."
        );


        // ============================================================
        // LOOPS
        // ============================================================
        /*
         * A loop is used to execute a block of code repeatedly.
         *
         * Java provides:
         *
         * 1. while loop
         * 2. do-while loop
         * 3. for loop
         * 4. enhanced for loop (for-each)
         *
         * Jump statements:
         *
         * 1. break
         * 2. continue
         * 3. return
         */


        // ============================================================
        // 1. WHILE LOOP
        // ============================================================
        /*
         * THEORY:
         *
         * A while loop checks the condition BEFORE executing
         * the loop body.
         *
         * Syntax:
         *
         * while (condition) {
         *     // code
         * }
         *
         * If the condition is false initially, the loop will
         * execute ZERO times.
         */


        // Example 1: Print 1 to 10

        System.out.println("\n--- While Loop: 1 to 10 ---");

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        // Example 2: Print 10 to 1

        System.out.println("\n--- While Loop: 10 to 1 ---");

        int j = 10;

        while (j >= 1) {
            System.out.println(j);
            j--;
        }


        // Example 3: Print even numbers

        System.out.println("\n--- While Loop: Even Numbers ---");

        int even = 2;

        while (even <= 20) {
            System.out.println(even);
            even += 2;
        }


        // ============================================================
        // 2. DO-WHILE LOOP
        // ============================================================
        /*
         * THEORY:
         *
         * A do-while loop executes the body FIRST and checks
         * the condition AFTER execution.
         *
         * Therefore, a do-while loop executes AT LEAST ONCE.
         *
         * Syntax:
         *
         * do {
         *     // code
         * } while (condition);
         *
         * Notice the semicolon after while(condition);
         */


        // Example 1: Print 1 to 5

        System.out.println("\n--- Do-While Loop: 1 to 5 ---");

        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 5);


        // Example 2: Condition is false initially

        System.out.println("\n--- Do-While: Executes Once ---");

        int number = 20;

        do {
            System.out.println("Number = " + number);
        } while (number <= 10);

        /*
         * Output:
         *
         * Number = 20
         *
         * Even though 20 <= 10 is false,
         * the code executes once.
         */


        // ============================================================
        // WHILE vs DO-WHILE
        // ============================================================
        /*
         *
         * while:
         *
         * condition -> body
         *
         * Can execute 0 times.
         *
         *
         * do-while:
         *
         * body -> condition
         *
         * Executes at least 1 time.
         */


        // ============================================================
        // 3. FOR LOOP
        // ============================================================
        /*
         * THEORY:
         *
         * A for loop is generally used when we know
         * how many times we want to execute the code.
         *
         * Syntax:
         *
         * for (initialization; condition; update) {
         *     // code
         * }
         *
         * Example:
         *
         * for (int x = 1; x <= 10; x++) {
         *     System.out.println(x);
         * }
         *
         * Three parts:
         *
         * 1. Initialization
         * 2. Condition
         * 3. Update
         */


        // Example 1: Print 1 to 10

        System.out.println("\n--- For Loop: 1 to 10 ---");

        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }


        // Example 2: Print 10 to 1

        System.out.println("\n--- For Loop: 10 to 1 ---");

        for (int x = 10; x >= 1; x--) {
            System.out.println(x);
        }


        // Example 3: Even numbers

        System.out.println("\n--- For Loop: Even Numbers ---");

        for (int x = 2; x <= 20; x += 2) {
            System.out.println(x);
        }


        // Example 4: Odd numbers

        System.out.println("\n--- For Loop: Odd Numbers ---");

        for (int x = 1; x <= 20; x += 2) {
            System.out.println(x);
        }


        // ============================================================
        // 4. ENHANCED FOR LOOP / FOR-EACH LOOP
        // ============================================================
        /*
         * THEORY:
         *
         * Enhanced for loop is mainly used to traverse arrays
         * and collections.
         *
         * Syntax:
         *
         * for (dataType variable : array) {
         *     // code
         * }
         */


        // Example

        System.out.println("\n--- Enhanced For Loop ---");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int value : numbers) {
            System.out.println(value);
        }


        // ============================================================
        // 5. NESTED LOOPS
        // ============================================================
        /*
         * THEORY:
         *
         * A loop inside another loop is called a nested loop.
         *
         * The inner loop executes completely for every iteration
         * of the outer loop.
         */


        // Example

        System.out.println("\n--- Nested Loop ---");

        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 3; column++) {

                System.out.println(
                        "Row = " + row + ", Column = " + column
                );
            }
        }


        // ============================================================
        // 6. PATTERN USING NESTED LOOP
        // ============================================================
        /*
         * Example:
         *
         * *
         * * *
         * * * *
         * * * * *
         */


        System.out.println("\n--- Star Pattern ---");

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print("* ");
            }

            System.out.println();
        }


        // ============================================================
        // 7. BREAK STATEMENT
        // ============================================================
        /*
         * THEORY:
         *
         * break is used to immediately terminate a loop.
         *
         * When break is executed, control comes outside
         * the loop.
         *
         * Syntax:
         *
         * break;
         */


        // Example

        System.out.println("\n--- Break Statement ---");

        for (int x = 1; x <= 10; x++) {

            if (x == 5) {
                break;
            }

            System.out.println(x);
        }

        /*
         * Output:
         *
         * 1
         * 2
         * 3
         * 4
         *
         * When x becomes 5,
         * break terminates the loop.
         */


        // ============================================================
        // 8. CONTINUE STATEMENT
        // ============================================================
        /*
         * THEORY:
         *
         * continue skips the CURRENT iteration
         * and moves to the NEXT iteration.
         *
         * Syntax:
         *
         * continue;
         */


        // Example

        System.out.println("\n--- Continue Statement ---");

        for (int x = 1; x <= 10; x++) {

            if (x == 5) {
                continue;
            }

            System.out.println(x);
        }

        /*
         * Output:
         *
         * 1
         * 2
         * 3
         * 4
         * 6
         * 7
         * 8
         * 9
         * 10
         *
         * 5 is skipped.
         */


        // ============================================================
        // BREAK vs CONTINUE
        // ============================================================
        /*
         *
         * break:
         *     Completely stops the loop.
         *
         * continue:
         *     Skips only the current iteration.
         *
         *
         * Example:
         *
         * break:
         *
         * 1 2 3 4 -> STOP
         *
         *
         * continue:
         *
         * 1 2 3 [skip 4] 5 6...
         */


        // ============================================================
        // 9. BREAK WITH WHILE LOOP
        // ============================================================

        System.out.println("\n--- Break with While Loop ---");

        int a = 1;

        while (a <= 10) {

            if (a == 6) {
                break;
            }

            System.out.println(a);

            a++;
        }


        // ============================================================
        // 10. CONTINUE WITH WHILE LOOP
        // ============================================================
        /*
         * IMPORTANT:
         *
         * When using continue in a while loop,
         * make sure the loop variable is updated properly.
         */


        System.out.println("\n--- Continue with While Loop ---");

        int b = 0;

        while (b < 10) {

            b++;

            if (b == 5) {
                continue;
            }

            System.out.println(b);
        }


        // ============================================================
        // 11. INFINITE LOOP
        // ============================================================
        /*
         * THEORY:
         *
         * A loop that never ends is called an infinite loop.
         *
         * Example:
         *
         * while (true) {
         *     System.out.println("Hello");
         * }
         *
         * Another example:
         *
         * for (;;) {
         *     System.out.println("Hello");
         * }
         *
         * Use infinite loops carefully.
         */


        // ============================================================
        // 12. SUM OF NUMBERS USING LOOP
        // ============================================================

        System.out.println("\n--- Sum of 1 to 10 ---");

        int sum = 0;

        for (int x = 1; x <= 10; x++) {
            sum = sum + x;
        }

        System.out.println("Sum = " + sum);


        // ============================================================
        // 13. FACTORIAL USING LOOP
        // ============================================================
        /*
         * 5! = 5 x 4 x 3 x 2 x 1
         *    = 120
         */


        System.out.println("\n--- Factorial ---");

        int n = 5;
        int factorial = 1;

        for (int x = 1; x <= n; x++) {
            factorial = factorial * x;
        }

        System.out.println("Factorial of " + n + " = " + factorial);


        // ============================================================
        // 14. MULTIPLICATION TABLE
        // ============================================================

        System.out.println("\n--- Multiplication Table ---");

        int table = 5;

        for (int x = 1; x <= 10; x++) {

            System.out.println(
                    table + " x " + x + " = " + (table * x)
            );
        }


        // ============================================================
        // 15. REVERSE A NUMBER
        // ============================================================
        /*
         * Example:
         *
         * 12345 -> 54321
         */


        System.out.println("\n--- Reverse Number ---");

        int original = 12345;
        int reverse = 0;

        while (original != 0) {

            int digit = original % 10;

            reverse = reverse * 10 + digit;

            original = original / 10;
        }

        System.out.println("Reverse = " + reverse);


        // ============================================================
        // 16. SUM OF DIGITS
        // ============================================================
        /*
         * Example:
         *
         * 12345
         *
         * 1 + 2 + 3 + 4 + 5 = 15
         */


        System.out.println("\n--- Sum of Digits ---");

        int num = 12345;
        int digitSum = 0;

        while (num != 0) {

            int digit = num % 10;

            digitSum = digitSum + digit;

            num = num / 10;
        }

        System.out.println("Sum of digits = " + digitSum);


        // ============================================================
        // 17. COUNT DIGITS
        // ============================================================

        System.out.println("\n--- Count Digits ---");

        int number2 = 12345;
        int count = 0;

        while (number2 != 0) {

            number2 = number2 / 10;

            count++;
        }

        System.out.println("Number of digits = " + count);


        // ============================================================
        // 18. PRIME NUMBER
        // ============================================================
        /*
         * A prime number has exactly two factors:
         *
         * 1. 1
         * 2. The number itself
         *
         * Examples:
         *
         * 2, 3, 5, 7, 11, 13...
         */


        System.out.println("\n--- Prime Number ---");

        int primeNumber = 29;
        boolean isPrime = true;

        if (primeNumber <= 1) {

            isPrime = false;

        } else {

            for (int x = 2; x <= primeNumber / 2; x++) {

                if (primeNumber % x == 0) {

                    isPrime = false;

                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(primeNumber + " is Prime");
        } else {
            System.out.println(primeNumber + " is Not Prime");
        }


        // ============================================================
        // 19. FIBONACCI SERIES
        // ============================================================
        /*
         * Fibonacci:
         *
         * 0 1 1 2 3 5 8 13 21...
         *
         * Each number is the sum of the previous two numbers.
         */


        System.out.println("\n--- Fibonacci Series ---");

        int first = 0;
        int second = 1;

        for (int x = 1; x <= 10; x++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println();


        // ============================================================
        // 20. RETURN STATEMENT
        // ============================================================
        /*
         * return is used to:
         *
         * 1. Exit from a method.
         * 2. Return a value from a method.
         *
         * Example:
         *
         * return;
         *
         * Or:
         *
         * return value;
         *
         * return is not normally used simply to control a loop;
         * it exits the entire method.
         */


        // ============================================================
        // QUICK REVISION
        // ============================================================
        /*
         *
         * WHILE LOOP
         * -----------
         * Condition is checked BEFORE execution.
         * Can execute zero times.
         *
         *
         * DO-WHILE LOOP
         * --------------
         * Condition is checked AFTER execution.
         * Executes at least once.
         *
         *
         * FOR LOOP
         * --------
         * Best when the number of iterations is known.
         *
         *
         * ENHANCED FOR LOOP
         * -----------------
         * Used mainly for arrays and collections.
         *
         *
         * BREAK
         * -----
         * Completely exits the loop.
         *
         *
         * CONTINUE
         * --------
         * Skips the current iteration.
         *
         *
         * RETURN
         * ------
         * Exits the current method.
         *
         */
    }
}
