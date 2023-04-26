package lambda_functional_programing;

import java.util.ArrayList;
import java.util.List;

public class Fp05 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(ortalamaPuanlarVerilenSayidanBuyukMu(coursesList,75));//true

    }
    /*
   1- )Tüm ortalama puanların verilen sayıdan büyük olup olmadığını kontrol etmek için bir method oluşturun.
    */
    public static boolean ortalamaPuanlarVerilenSayidanBuyukMu(List<Courses> list, double x) {
        return list.stream().allMatch(t->t.getAverageScore()>x);
    }

    /*
    2- )Kurs adlarından en az birinin verilen kelimeyi içerip içermediğini kontrol etmek için bir method oluşturun
     */
    public static boolean herhangiBirKursAdiKelimeyiIceriyorMu(List<Courses> list, String kelime) {
        return
    }
}
