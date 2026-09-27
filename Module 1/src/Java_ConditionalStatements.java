// Topic: Java Conditional Statements

// If, If-Else, If-Else-If Ladder, Nested If, Switch Explained.
//
// ============================================================
// CONDITIONAL STATEMENTS IN JAVA
// ============================================================
//
// Conditional statements are used to make decisions in a program.
//
// A condition is evaluated as:
//      true  -> execute a block of code
//      false -> skip the block or execute another block
//
// Java provides:
//
// 1. if statement
// 2. if-else statement
// 3. if-else-if ladder
// 4. Nested if
// 5. switch statement
// 6. switch expression
//
// ============================================================


public class Java_ConditionalStatements {

    public static void main(String[] args) {

        System.out.println(
                "Topic: Java Conditional Statements | If, If-Else, If-Else-If Ladder, Switch Explained."
        );


        // ============================================================
        // 1. IF STATEMENT
        // ============================================================
        //
        // The if statement executes code only when the condition
        // is true.
        //
        // Syntax:
        //
        // if (condition) {
        //     // code
        // }
        //
        // ============================================================

        System.out.println("\n===== 1. IF Statement =====");

        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        }


        // ------------------------------------------------------------
        // Another if example
        // ------------------------------------------------------------

        int marks = 85;

        if (marks >= 40) {
            System.out.println("Student has passed.");
        }


        // ============================================================
        // 2. IF WITH BOOLEAN
        // ============================================================

        System.out.println("\n===== 2. IF with Boolean =====");

        boolean isLoggedIn = true;

        if (isLoggedIn) {
            System.out.println("Welcome! User is logged in.");
        }


        // ============================================================
        // 3. IF-ELSE STATEMENT
        // ============================================================
        //
        // if-else provides two possible paths.
        //
        // If condition is true:
        //     if block executes
        //
        // If condition is false:
        //     else block executes
        //
        // Syntax:
        //
        // if (condition) {
        //     // true block
        // } else {
        //     // false block
        // }
        //
        // ============================================================

        System.out.println("\n===== 3. IF-ELSE =====");

        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is not positive.");
        }


        // ============================================================
        // 4. EVEN OR ODD USING IF-ELSE
        // ============================================================

        System.out.println("\n===== 4. Even or Odd =====");

        int checkNumber = 25;

        if (checkNumber % 2 == 0) {
            System.out.println(checkNumber + " is Even.");
        } else {
            System.out.println(checkNumber + " is Odd.");
        }


        // ============================================================
        // 5. PASS OR FAIL
        // ============================================================

        System.out.println("\n===== 5. Pass or Fail =====");

        int studentMarks = 72;

        if (studentMarks >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }


        // ============================================================
        // 6. POSITIVE, NEGATIVE OR ZERO
        // ============================================================
        //
        // Here we need more than two conditions.
        // We can use an if-else-if ladder.
        //
        // ============================================================

        System.out.println("\n===== 6. Positive, Negative or Zero =====");

        int value = -10;

        if (value > 0) {
            System.out.println("Positive");
        } else if (value < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


        // ============================================================
        // 7. IF-ELSE-IF LADDER
        // ============================================================
        //
        // Used when there are multiple conditions.
        //
        // Syntax:
        //
        // if (condition1) {
        //
        // } else if (condition2) {
        //
        // } else if (condition3) {
        //
        // } else {
        //
        // }
        //
        // Conditions are checked from top to bottom.
        //
        // As soon as one condition becomes true,
        // its block executes and the remaining conditions are skipped.
        //
        // ============================================================

        System.out.println("\n===== 7. IF-ELSE-IF Ladder =====");

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade: A+");
        } else if (score >= 80) {
            System.out.println("Grade: A");
        } else if (score >= 70) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else if (score >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }


        // ============================================================
        // 8. NESTED IF
        // ============================================================
        //
        // An if statement inside another if statement is called
        // a nested if.
        //
        // ============================================================

        System.out.println("\n===== 8. Nested IF =====");

        int userAge = 25;
        boolean hasLicense = true;

        if (userAge >= 18) {

            System.out.println("User is an adult.");

            if (hasLicense) {
                System.out.println("User can drive.");
            } else {
                System.out.println("User does not have a driving license.");
            }

        } else {

            System.out.println("User is under 18.");

        }


        // ============================================================
        // 9. MULTIPLE CONDITIONS USING &&
        // ============================================================
        //
        // && means Logical AND.
        //
        // Both conditions must be true.
        //
        // ============================================================

        System.out.println("\n===== 9. Multiple Conditions with && =====");

        int loginAge = 25;
        boolean verified = true;

        if (loginAge >= 18 && verified) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }


        // ============================================================
        // 10. MULTIPLE CONDITIONS USING ||
        // ============================================================
        //
        // || means Logical OR.
        //
        // At least one condition must be true.
        //
        // ============================================================

        System.out.println("\n===== 10. Multiple Conditions with || =====");

        boolean hasCash = false;
        boolean hasCard = true;

        if (hasCash || hasCard) {
            System.out.println("Payment can be made.");
        } else {
            System.out.println("Payment cannot be made.");
        }


        // ============================================================
        // 11. USING ! WITH IF
        // ============================================================
        //
        // ! means Logical NOT.
        //
        // true  -> false
        // false -> true
        //
        // ============================================================

        System.out.println("\n===== 11. Logical NOT =====");

        boolean raining = false;

        if (!raining) {
            System.out.println("It is not raining.");
        }


        // ============================================================
        // 12. NESTED IF-ELSE
        // ============================================================

        System.out.println("\n===== 12. Nested IF-ELSE =====");

        int marks2 = 85;

        if (marks2 >= 40) {

            if (marks2 >= 80) {
                System.out.println("Passed with distinction.");
            } else {
                System.out.println("Passed.");
            }

        } else {

            System.out.println("Failed.");

        }


        // ============================================================
        // 13. SWITCH STATEMENT
        // ============================================================
        //
        // switch is useful when one value needs to be compared
        // against multiple fixed values.
        //
        // Syntax:
        //
        // switch (expression) {
        //
        //     case value1:
        //         // code
        //         break;
        //
        //     case value2:
        //         // code
        //         break;
        //
        //     default:
        //         // code
        // }
        //
        // ============================================================

        System.out.println("\n===== 13. SWITCH Statement =====");

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day.");

        }


        // ============================================================
        // 14. WHY BREAK IS USED IN SWITCH
        // ============================================================
        //
        // break stops execution of the switch.
        //
        // Without break, Java may continue executing the following
        // cases. This is called fall-through.
        //
        // ============================================================

        System.out.println("\n===== 14. Switch Fall-Through =====");

        int option = 1;

        switch (option) {

            case 1:
                System.out.println("Case 1");

            case 2:
                System.out.println("Case 2");

            case 3:
                System.out.println("Case 3");

            default:
                System.out.println("Default");

        }

        // Because there are no break statements,
        // execution continues into the following cases.


        // ============================================================
        // 15. SWITCH WITH BREAK
        // ============================================================

        System.out.println("\n===== 15. Switch with Break =====");

        int menu = 2;

        switch (menu) {

            case 1:
                System.out.println("Home");
                break;

            case 2:
                System.out.println("Profile");
                break;

            case 3:
                System.out.println("Settings");
                break;

            default:
                System.out.println("Invalid option.");

        }


        // ============================================================
        // 16. SWITCH WITH STRING
        // ============================================================
        //
        // String can be used in switch statements.
        //
        // ============================================================

        System.out.println("\n===== 16. Switch with String =====");

        String browser = "Chrome";

        switch (browser) {

            case "Chrome":
                System.out.println("Google Chrome selected.");
                break;

            case "Firefox":
                System.out.println("Mozilla Firefox selected.");
                break;

            case "Edge":
                System.out.println("Microsoft Edge selected.");
                break;

            case "Safari":
                System.out.println("Apple Safari selected.");
                break;

            default:
                System.out.println("Unknown browser.");

        }


        // ============================================================
        // 17. SWITCH WITH CHAR
        // ============================================================

        System.out.println("\n===== 17. Switch with char =====");

        char grade = 'A';

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Needs Improvement");
                break;

            default:
                System.out.println("Invalid grade.");

        }


        // ============================================================
        // 18. MULTIPLE CASES
        // ============================================================
        //
        // Multiple cases can execute the same block of code.
        //
        // ============================================================

        System.out.println("\n===== 18. Multiple Cases =====");

        int dayNumber = 6;

        switch (dayNumber) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day.");

        }


        // ============================================================
        // 19. SWITCH EXPRESSION
        // ============================================================
        //
        // Modern Java supports switch expressions.
        //
        // The switch can return a value.
        //
        // Syntax:
        //
        // variable = switch (expression) {
        //     case value -> result;
        //     default -> result;
        // };
        //
        // ============================================================

        System.out.println("\n===== 19. Switch Expression =====");

        int month = 3;

        String monthName = switch (month) {

            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";

            default -> "Invalid Month";

        };

        System.out.println("Month: " + monthName);


        // ============================================================
        // 20. SWITCH EXPRESSION WITH YIELD
        // ============================================================
        //
        // yield is used when a switch case contains multiple
        // statements and needs to return a value.
        //
        // ============================================================

        System.out.println("\n===== 20. Switch with yield =====");

        int numberOfDays = 2;

        String days = switch (numberOfDays) {

            case 1 -> "One day";

            case 2 -> {
                System.out.println("Processing two days...");
                yield "Two days";
            }

            default -> "Unknown";

        };

        System.out.println(days);


        // ============================================================
        // 21. CALCULATOR USING SWITCH
        // ============================================================

        System.out.println("\n===== 21. Calculator Using Switch =====");

        double firstNumber = 20;
        double secondNumber = 5;

        char operator = '*';

        switch (operator) {

            case '+':
                System.out.println(
                        "Result: " + (firstNumber + secondNumber)
                );
                break;

            case '-':
                System.out.println(
                        "Result: " + (firstNumber - secondNumber)
                );
                break;

            case '*':
                System.out.println(
                        "Result: " + (firstNumber * secondNumber)
                );
                break;

            case '/':
                if (secondNumber != 0) {
                    System.out.println(
                            "Result: " + (firstNumber / secondNumber)
                    );
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            case '%':
                System.out.println(
                        "Result: " + (firstNumber % secondNumber)
                );
                break;

            default:
                System.out.println("Invalid operator.");

        }


        // ============================================================
        // 22. VOTING ELIGIBILITY
        // ============================================================

        System.out.println("\n===== 22. Voting Eligibility =====");

        int voterAge = 20;

        if (voterAge >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }


        // ============================================================
        // 23. FIND LARGEST OF TWO NUMBERS
        // ============================================================

        System.out.println("\n===== 23. Largest of Two Numbers =====");

        int firstValue = 50;
        int secondValue = 30;

        if (firstValue > secondValue) {
            System.out.println(firstValue + " is larger.");
        } else if (secondValue > firstValue) {
            System.out.println(secondValue + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }


        // ============================================================
        // 24. FIND LARGEST OF THREE NUMBERS
        // ============================================================

        System.out.println("\n===== 24. Largest of Three Numbers =====");

        int n1 = 50;
        int n2 = 80;
        int n3 = 30;

        if (n1 >= n2 && n1 >= n3) {

            System.out.println(n1 + " is largest.");

        } else if (n2 >= n1 && n2 >= n3) {

            System.out.println(n2 + " is largest.");

        } else {

            System.out.println(n3 + " is largest.");

        }


        // ============================================================
        // 25. LEAP YEAR
        // ============================================================
        //
        // A year is a leap year when:
        //
        // 1. It is divisible by 400
        //
        // OR
        //
        // 2. It is divisible by 4 but NOT divisible by 100
        //
        // ============================================================

        System.out.println("\n===== 25. Leap Year =====");

        int year = 2024;

        if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {

            System.out.println(year + " is a leap year.");

        } else {

            System.out.println(year + " is not a leap year.");

        }


        // ============================================================
        // 26. AGE CATEGORY
        // ============================================================

        System.out.println("\n===== 26. Age Category =====");

        int personAge = 25;

        if (personAge < 0) {

            System.out.println("Invalid age.");

        } else if (personAge <= 12) {

            System.out.println("Child.");

        } else if (personAge <= 19) {

            System.out.println("Teenager.");

        } else if (personAge <= 59) {

            System.out.println("Adult.");

        } else {

            System.out.println("Senior.");

        }


        // ============================================================
        // 27. LOGIN SYSTEM
        // ============================================================

        System.out.println("\n===== 27. Login Example =====");

        String username = "admin";
        String password = "1234";

        if (username.equals("admin") &&
                password.equals("1234")) {

            System.out.println("Login successful.");

        } else {

            System.out.println("Invalid username or password.");

        }


        // ============================================================
        // 28. NESTED CONDITIONS - ATM EXAMPLE
        // ============================================================

        System.out.println("\n===== 28. ATM Example =====");

        double balance = 5000;
        double withdrawal = 2000;

        boolean cardInserted = true;
        boolean pinCorrect = true;

        if (cardInserted) {

            System.out.println("Card detected.");

            if (pinCorrect) {

                System.out.println("PIN verified.");

                if (withdrawal <= balance) {

                    balance -= withdrawal;

                    System.out.println(
                            "Withdrawal successful."
                    );

                    System.out.println(
                            "Remaining balance: " + balance
                    );

                } else {

                    System.out.println(
                            "Insufficient balance."
                    );

                }

            } else {

                System.out.println("Incorrect PIN.");

            }

        } else {

            System.out.println("Please insert your card.");

        }


        // ============================================================
        // 29. CONDITIONAL OPERATOR / TERNARY
        // ============================================================
        //
        // Although ternary is technically an operator rather than
        // a statement, it is commonly used for simple conditions.
        //
        // Syntax:
        //
        // condition ? value1 : value2;
        //
        // ============================================================

        System.out.println("\n===== 29. Ternary Operator =====");

        int testMarks = 65;

        String testResult =
                testMarks >= 40 ? "PASS" : "FAIL";

        System.out.println("Result: " + testResult);


        // ============================================================
        // 30. IMPORTANT DIFFERENCE: if vs switch
        // ============================================================
        //
        // if:
        // - Best for ranges and complex conditions.
        // - Can use relational operators.
        // - Can combine conditions using && and ||.
        //
        // switch:
        // - Useful for matching one expression against
        //   multiple fixed values/cases.
        // - Cleaner when there are many discrete choices.
        //
        // Example:
        //
        // if (marks >= 80)
        //
        // This checks a range.
        //
        // switch (day)
        //
        // This matches a specific value.
        //
        // ============================================================


        // ============================================================
        // KEY POINTS TO REMEMBER
        // ============================================================
        //
        // 1. if executes code when a condition is true.
        //
        // 2. if-else provides two execution paths.
        //
        // 3. if-else-if is used for multiple conditions.
        //
        // 4. Conditions must evaluate to boolean.
        //
        // 5. Nested if means an if statement inside another
        //    if/else block.
        //
        // 6. && means AND.
        //
        // 7. || means OR.
        //
        // 8. ! means NOT.
        //
        // 9. switch is useful for multiple fixed choices.
        //
        // 10. break prevents switch fall-through.
        //
        // 11. default executes when no switch case matches.
        //
        // 12. String can be used with switch.
        //
        // 13. char can be used with switch.
        //
        // 14. Modern Java supports switch expressions using ->.
        //
        // 15. yield can return a value from a block in a
        //     switch expression.
        //
        // 16. Ternary operator is useful for simple conditions.
        //
        // ============================================================

    }
}
