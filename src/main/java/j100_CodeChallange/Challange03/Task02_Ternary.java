package j100_CodeChallange.Challange03;

import java.util.Scanner;

public class Task02_Ternary {
    /* Task->
     * Girilen fiyat içinb
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("urunun fiyatını giriniz");
        int fiyat= input.nextInt();
        String sonuc=fiyat<20 ? (fiyat<10?"ucuz":"normal") :"pahalı";
        System.out.println("sonuc = " + sonuc);

    }
}
