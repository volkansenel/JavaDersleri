package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task05 {

        /* Task->
         * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("birinci kelimeyi gir");
        String kelime1= input.next();
        System.out.println("ikinci kelimeyi gir");
        String kelime2= input.next();
        System.out.println("ücüncü kelimeyi gir");
        String kelime3= input.next();
        System.out.println("dorduncu kelimeyi gir");
        String kelime4= input.next();
        System.out.println(kelime1+" "+kelime2+" "+kelime3+" "+kelime4+".");

    }

}
