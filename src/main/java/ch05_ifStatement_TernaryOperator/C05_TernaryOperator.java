package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz
Scanner input=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
int sayi= input.nextInt();

        String result=sayi%2==0 ? "sayinin yarisi="+(sayi/2):"girilen sayi tek oldugu icin yarisi tam degil";
        System.out.println("result = " + result);


    }
}
