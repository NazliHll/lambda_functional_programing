package lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfleYazdir01(liste); // ALİ ALİ MARK AMANDA CHRİSTOPHER JACKSON MARİANO ALBERTO TUCKER BENJAMİN
        System.out.println();
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugunaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);

        /*
         buyukHarfleYazdir02(liste); // [ALİ, ALİ, MARK, AMANDA, CHRİSTOPHER, JACKSON, MARİANO, ALBERTO, TUCKER, BENJAMİN]
         */
    }

    /*
   1- ) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    */
    public static void buyukHarfleYazdir01(List<String> list) { // 1. YOL
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
   /* public static void buyukHarfleYazdir02(List<String> list){ // 2. YOL
        list.replaceAll(String::toUpperCase);
        System.out.print(list);
        Listemiz mutable oldugu icin yorum satirina aldik. Bu method listemizi degistirdi.
    }
    */


    /*
    2- ) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
     */
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // Comparator.comparing(); --> siralama kosulunu belirtmek icin kullanilir.
    }
    /*
   3- ) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    */
    public static void uzunlugunaGoreTersYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*
    4- ) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
     */
    public static void sonKaraktereGoreTekrarsizSirala(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*
    5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp
    yazdıran bir method oluşturun.
     */
    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing())
    }

}
