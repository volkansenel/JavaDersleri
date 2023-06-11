package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task06 {
    /*  Tsk->
   girilen  Stringin ilk iki karakteri haric string return eden code create ediniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= input.next();
        String harf2= String.valueOf(kelime.charAt(1));
        if (kelime.startsWith("gh")){
            kelime.substring(0);
            System.out.println(kelime);

        }
        else if (kelime.startsWith("g")) {
            String kelime1=kelime.substring(2);
            System.out.println("g"+kelime1);

        }
        else if (harf2.equals("h")){
            String kelime2=kelime.substring(1);
            System.out.println(kelime2);

        }else {
           String kelime3=kelime.substring(2);
            System.out.println(kelime3);
        }


    }
}