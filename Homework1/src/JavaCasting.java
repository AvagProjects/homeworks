public class JavaCasting {
    public static void main(String[] args){
//   Խնդիր 14. Ստեղծել int aa  = 7 և long bb փոփոխականներ,
//  կատարել Cast գործողություն  aa -> bbb  և տպել console -ում․
    int aa = 7;
    long bb = aa;
    System.out.println(bb);
//  Խնդիր 15. Ստեղծել int myInt  = 7 և double myDouble փոփոխականներ,
//  կատարել Cast գործողություն  myInt -> myDouble  և տպել console -ում․
        int myInt = 11;
        double myDouble = myInt;
        System.out.println(myDouble);
//  Խնդիր 16. Ստեղծել double dd = 9.78d և int ii փոփոխականներ,
//      կատարել Cast գործողություն  dd -> ii  և տպել console -ում․
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println(ii);
//  Խնդիր 17. Ստեղծել int ff = 9999 և byte gg փոփոխականներ,
//      կատարել Cast գործողություն  ff -> gg  և տպել console -ում․
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(gg);
//  Խնդիր 18
//        long max = 3123456789;                   //  Թիվը դուրս է long-ի սահմաններից՝ առանց 'L'
//        double d = 1000_.00;                     // Չի կարելի թվի վերջում _ օգտագործել
//        char i = ’i’; char j=’j’; char ij = i + j; // Սխալ չակերտներ
//        int 7a = 8;                              // Անունը չի կարող սկսվել թվով
//        long h = h  + 8;                         // h դեռ չի հայտարարված
    }
}
