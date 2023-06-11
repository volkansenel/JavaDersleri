package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task12 {
    // Task-> Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Task-> Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" birseyler yaz bakalım kardas");
        String sey= input.nextLine();

        if (sey.contains(" ")) System.out.println("yazdıklarında boşluk var");
        else System.out.println(" yazdıklarında bosluk yok");
        System.out.println(" hele birşeyler daha yaz bakem");
        String sey1= input.nextLine();

        System.out.println("sey1.isEmpty() = " + sey1.isEmpty());


    }
}
