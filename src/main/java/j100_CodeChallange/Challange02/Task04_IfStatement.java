package j100_CodeChallange.Challange02;

import java.util.Scanner;

public class Task04_IfStatement {

        /* Task ->
         * Girilen Y/N  degerlerini
         * print eden code create ediniz..
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Y veya N harflerinden birini giriniz");
String giris=input.next().toUpperCase();
    if (giris.equals("Y")) System.out.println("YES");
    else if (giris.equals("N")) System.out.println("NO");
    else System.out.println("yanlış bir giriş yaptınız");
    }

}
