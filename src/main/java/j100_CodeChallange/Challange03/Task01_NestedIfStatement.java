package j100_CodeChallange.Challange03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas= input.nextInt();
        if (yas<18) System.out.println("yasınız oy kullanmaya uygun degil");
        else if ( 50 > yas) System.out.println(" bir kez oy kullanabilirsiniz");
        else if ( 70 > yas && yas>=50) System.out.println(" iki kez oy kullanabilirsiniz");
           else if  (yas >= 70) System.out.println(" üc kez oy kullanabilirsiniz");


    }

}