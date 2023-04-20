package lambda_functional_programing;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {
       /*
  1- ) t-> "Logic" , (t,u) -> "logic"
       Bu yapiya "Lambda Expression"
  2- ) Functional Programming kapsaminda "Lambda Expression" kullanilabilir ama onerilmez.
       "Lambda Expression" yerine "FunctionMethod Reference" tercih edilir.
  3- ) "Method Reference" kullanimi "Class Name :: Method Name
        Ayni zamanda kendi class'larinizi da kullanabilirsiniz.
        Ornegin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
     */

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println("");
        ciftElemanlariYazdir(liste);
        System.out.println("");
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println("");
        tekrarsizTekElemanlarinKupunuYazdir(liste);
    }

    /*
    1- ) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak
    yazdıran bir method oluşturun.(Functional ve method reference)
     */
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*
       2- )Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak
       yazdıran bir method oluşturun.(Functional)
        */
    public static void ciftElemanlariYazdir(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*
    3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında
    boşluk bırakarak yazdıran bir method oluşturun.(Functional)
     */
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*
   4- ) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda
   aralarında boşluk bırakarak yazdıran bir method oluşturun.
    */
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    /*
    5- ) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
     */
    public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> list) {

    }
}

