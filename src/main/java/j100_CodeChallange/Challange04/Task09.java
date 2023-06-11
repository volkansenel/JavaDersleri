package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task09 {
    /* Task->
      Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri print eden code create ediniz.
      */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("aslanım hele bir kelime giriver");
        String kelime= input.next();
        int uzunluk=kelime.length();
        if (uzunluk%2!=0&&uzunluk>=3){
            char harf=kelime.charAt((kelime.length()/2));
            System.out.println("harf = " + harf);


        }else System.out.println("aslanım senin kelimenin ortasında harf yok:)");

    }
}
