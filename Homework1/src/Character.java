public class Character {
    public static void main(String[] args) {
//   Խնդիր 10․ Ստեղծել 2 փոփոխական(char n և char o ),վերագրել կամայական արժեքներ և տպել   console -ում․
        char n = 'A';
        char o = 'C';
        System.out.println(n + "," + o);
//  Խնդիր 11.  Օգտվելով https://www.ssec.wisc.edu/~tomw/java/unicode.html
//        11.1 Տպել char s = 77;  և char w = 109;  արժեքները;
        char s = 77;
        char w = 109;
        System.out.println(s + "," + w);
//        11.2 Տպել ՛K՛ symbolը  բոլոր հնարավոր տարբերակներով
        char k1 = 'K';
        char k2 = '\u004B';
        char k3 = 0x004B;
        char k4 = 75;
        System.out.println(k1 + "," + k2 + "," + k3 + "," + k4);
    }
}
