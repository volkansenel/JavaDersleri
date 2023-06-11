package j100_CodeChallange.Challange04;

import java.util.Scanner;

public class Task13 {
    //Task-> Girilen   4 harfli bir kelimeyi tersten print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("4 harfli bir kelime gir bakem");
        String dort= input.next();
        int uzunluk=dort.length();

        if (uzunluk==4){
            char harf1=dort.charAt(3);
            char harf2=dort.charAt(2);
            char harf3=dort.charAt(1);
            char harf4=dort.charAt(0);
            System.out.println(""+harf1+harf2+harf3+harf4);



        }else System.out.println("kardaş 4 harfli kelime girmedin");


    }

}
