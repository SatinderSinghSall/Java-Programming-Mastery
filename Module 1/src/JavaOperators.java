// Topic: Java Operators | Arithmetic + Unary + Logical + Bitwise + Assignment Operators.

public class JavaOperators {
    public static void main(String[] args) {
        System.out.println("Topic: Java Operators | Arithmetic + Unary + Logical + Bitwise + Assignment Operators.");

        // 1. Arithmetic Operators: +, -, /, %, +=, -+, /=. %=, ++, --
        int a = 5;
        int b = 10;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;

        System.out.println(c +  ", " + d + ", " + e + ", " + f + ", " + g);

        int h = a + 2; // 7
        h = h + 2; // 9
        h += 2; // 11
        System.out.println(h);

        int i = 6;
        i ++; // 7
        System.out.println(i);

        int j = 7;
        ++ j; // 8
        System.out.println(j);

        boolean k = (j != b);
        System.out.println(k); // true
    }
}
