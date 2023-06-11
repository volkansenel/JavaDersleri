package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen  pozitof bir tamsayının 2 veya daha fazla
        // basamaklı olmasını
        // kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("pozitif bir tamsayi giriniz");
        Integer sayi1= input.nextInt();
        System.out.println((sayi1/100)==0 ?"sayi 2 veya daha az basamakli" : "sayi ikiden fazla basamakli");
    }
}