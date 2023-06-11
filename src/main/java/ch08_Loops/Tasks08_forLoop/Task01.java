package ch08_Loops.Tasks08_forLoop;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..

         */
        Scanner input = new Scanner(System.in);
        System.out.println("birinci tam sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("ikinci tam sayiyi giriniz");
        int sayi2 = input.nextInt();
        if (sayi1 < sayi2) {
            for (int i = sayi1+1; i < sayi2; i++) {
                if (i % 2 == 0) System.out.print(i);

            }
        } else if (sayi2 < sayi1) {
            for (int i = sayi2+1; i < 1; i++) {
                if (i % 2 == 0) System.out.print(i);
            }


        }else System.out.println("girdiğin sayilar birbirine esit dostum");

    }

}




















