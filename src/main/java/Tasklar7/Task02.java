package Tasklar7;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner input=new Scanner(System.in);
        System.out.println("şifrenizi giriniz");
        String sifre= input.nextLine();
        char ilkkarakter=sifre.charAt(0);
        char sonkarakter=sifre.charAt(sifre.length()-1);
        int uzunluk=sifre.length();
        if (Character.isDigit(sonkarakter) && ilkkarakter==Character.toUpperCase(ilkkarakter) && uzunluk>=6){
            System.out.println("sifreniz gecerlidir");
        }else System.out.println("sifreniz gecerli degildir");
    }
}
