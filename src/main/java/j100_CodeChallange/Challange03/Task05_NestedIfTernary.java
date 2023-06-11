package j100_CodeChallange.Challange03;
import java.util.Scanner;

public class Task05_NestedIfTernary {
/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bizim ooolan final notunuzu harf değerini giriniz :");
        char finalNot=input.next().charAt(0);
        System.out.println(finalNot == 'A' ? "Gayet Basarili" : finalNot == 'B' ? "Basarili" : finalNot == 'C' ? "Ha gayret" : "seneye inş");





    }
}
