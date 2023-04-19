package lambda_functional_programing;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
        /*
      1- ) Lambda (Functional Programming) Java 8 ile kullanilmaya baslamistir.

      2- ) Functional Programming'de "Ne yapilacak" (What to do) üzerine yogunlaşılır.
           Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğunlaşılır.

      3- ) Functional Programming Arrays ve Collections ile kullanilir.

      4- ) "entryset() methodu ile Map, Set'e dönüştürülerek Functional Programming'de
            kullanilir.
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
        System.out.println(liste);//[8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirStructured(liste);
    }
        /*
        1- ) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak
        yazdıran bir method oluşturun.(Structured)
         */
        public static void listElemanlariniYazdirStructured(List<Integer>list){

            for (Integer w:list
                 ) {
                System.out.print(w+" ");//8 9 131 10 9 10 2 8

            }

            }
        }




