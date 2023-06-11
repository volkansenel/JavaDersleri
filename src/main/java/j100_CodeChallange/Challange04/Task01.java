package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task01 {

        //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("isim ve soyisminizi giriniz");
        String isim= input.nextLine().toUpperCase();
        System.out.println("isim = " + isim);

    }

}
