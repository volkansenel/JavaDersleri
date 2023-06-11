package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("aslanım hele bir ismini giriver");
        String isim= input.next();
        System.out.println(" hele bir de soyisimini gir bakem");
        String soyisim= input.next();
       int isuz=isim.length();
       int soyuz=soyisim.length();
       if (isuz>soyuz) System.out.println("ismin daha uzun kardaş");
       else if (soyuz>isuz) System.out.println("soyadın daha uzunmuş kardaş");
       else System.out.println(" ikisi de eşit çıktı be kardaş :)");

    }

}
