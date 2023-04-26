package lambda_functional_programing;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplama01());//5029
        System.out.println(get7den100eToplam02());//5029
    }

    /*
    1- ) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
     */
    public static int get7den100eToplama01(){//1.yol
        return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
    }
    public static int get7den100eToplam02() { // 2. YOL
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
        /*
        ==> range yaptigimizda son rakdamdan bir fazlasini yazmamiz gerekiyor cunku
            yazdigimiz son degeri almadan calisiyor
        ==> fakat rangeClosed kullandigimizda son rakami da dahil ediyor, o yuzden
            bir fazlasini yazmamiza gerek kalmiyor.
         */
    }

    /*
    2- ) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
     */

}
