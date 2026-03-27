public class Variables {
    public static void main(String[] args) {
        //Problem 1
        byte a = 10;
        byte b = 20;
        System.out.println("byte a: " + a + ", b: " + b);

        //Problem 2
        short c = 300;
        short d = 400;
        System.out.println("short c:" + c + ", d:" + d);

        //Problem 3
        int e = 5000;
        int f = 6000;
        System.out.println("int e:" + e + ", f:" + f);

        //Problem 4
        long g = 700000L;
        long h = 800000L;
        System.out.println("long g:" + g + ", h:" + h);

        //Problem 5
        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        //Problem 6
        byte s = 0b1010; // 10 in decimal
        int v = 0b1111011; // 123 in decimal
        System.out.println("Binary byte: " + s + ", Binary int: " + v);

        //Problem 7
        float j = 10.5f;
        float k = 20.5f;
        System.out.println("float j:" + j + ", k:" + k);

        //Problem 8
        double l = 3.12;
        double m = 4.15;
        System.out.println("double l:" + l + ", m:" + m);

        //Problem 9
        System.out.println("Float Max: " + Float.MAX_VALUE + ", Min: " + Float.MIN_VALUE);
        System.out.println("Double Max: " + Double.MAX_VALUE + ", Min: " + Double.MIN_VALUE);

        //Problem 10
        char n = 'A';
        char o = 'B';
        System.out.println("char n:" + n + ", o:" + o);

        //Problem 11.1
        char t = 77;
        char w = 109;
        System.out.println("s: " + t + ", w: " + w);

        //Problem 11.2
        char k1 = 'K';
        char k2 = 75;
        char k3 = '\u004B';
        System.out.println("K variants: " + k1 + ", " + k2 + ", " + k3);

        //Problem 12
        boolean p = true;
        boolean q = false;
        System.out.println("boolean p: " + p + ", q: " + q);

        //Problem 13
//        int year = 201l;
//        System.out.print (year);

        //Problem 14
        int aa = 7;
        long bb = aa;
        System.out.println("Widening (int to long): " + bb);

        //Problem 15
        int myInt = 7;
        double myDouble = myInt;
        System.out.println("Widening (int to double): " + myDouble);

        //Problem 16
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println("Narrowing (double to int): " + ii);

        //Problem 17
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println("Narrowing (int to byte): " + gg);

        //Problem 18
        long fixedMax = 3123456789L; // Added 'L' for long literal
        double fixedD = 1000.00;     // Underscore cannot be next to decimal point
        char charI = 'i'; char charJ = 'j';
        int ij = charI + charJ;      // char + char results in an int
        int a7 = 8;                  // Variable names cannot start with a digit
        long fixedH = 0; fixedH = fixedH + 8; // Initialize h before use
        int nVar = 0, mVar = 11; nVar = mVar; // Initialize n before assigning to m

    }
}
