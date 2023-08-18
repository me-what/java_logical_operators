public class Main {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a); // false
        System.out.println(!false); // true
        System.out.println(!(2 < 5)); // false
        System.out.println();

        boolean a2 = true;
        boolean b = false;
        boolean c = true;
        System.out.println(a2 & b); // false
        System.out.println(a2 & c); // true
        System.out.println(false & (2 > 5)); // false
        System.out.println((2 < 5) & false); // false
        System.out.println();

        boolean a3 = true;
        boolean b3 = false;
        boolean c3 = true;
        System.out.println(!a3 | b3); // false.
        System.out.println(a3 | c3); // true
        System.out.println((2 < 5) | false); // true
        System.out.println((2 > 5) | true); // true
        System.out.println();

        boolean a4 = true;
        boolean b4 = false;
        boolean c4 = true;
        System.out.println(!a4 ^ b4); // false.
        System.out.println(a4 ^ c4); // false
        System.out.println((2 < 5) ^ false); // true
        System.out.println((2 > 5) ^ true); // true
        System.out.println();

        boolean a5 = true, b5 = true, c5 = false;
        System.out.println(a5 | b5 & c5); // true
        System.out.println();

        boolean a6 = true, b6 = true, c6 = false;
        System.out.println((a6|b6)&c6); // false
        System.out.println();
    }
}