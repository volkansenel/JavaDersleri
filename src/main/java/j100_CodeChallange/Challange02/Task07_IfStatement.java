package j100_CodeChallange.Challange02;


import java.util.Scanner;

public class Task07_IfStatement {


        /*

         task->
         Kullanicinın  yas ve kilo bilgileri için
         18 yasindan kucuk ise kan bagisi yapamaz.
         18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
         18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
         print eden code create ediniz.

          */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas= input.nextInt();
        System.out.println("kilonuzu giriniz");
        int kilo= input.nextInt();
        if (yas<18) System.out.println("kan bagısı yapamaz");
        else if (kilo<50) System.out.println("kan bagısı yapamaz");
        else  System.out.println("kan bagısı yapabilir");


    }
}