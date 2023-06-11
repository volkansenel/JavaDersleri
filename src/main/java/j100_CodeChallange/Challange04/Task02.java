package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birinci kelimeyi giriniz");
        String kelime1= input.next();
        System.out.println("ikinci kelimeyi giriniz");
        String kelime2= input.next();
        System.out.println(kelime1+kelime2);
        System.out.println(kelime1.concat(kelime2));


    }

}