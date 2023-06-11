package Tasklar6;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= input.nextInt();
        int onlarbasamagı=(sayi%100)/10;
switch(onlarbasamagı){
    case 0 :
        System.out.println("sayinizin onlar basamagı sifir");
        break;
    case 1 :
        System.out.println("sayinizin onlar basamagı bir");
        break;
    case 2 :
        System.out.println("sayinizin onlar basamagı iki");
        break;
    case 3 :
        System.out.println("sayinizin onlar basamagı uc");
        break;
    case 4 :
        System.out.println("sayinizin onlar basamagı dort");
        break;
    case 5 :
        System.out.println("sayinizin onlar basamagı bes");
        break;
    case 6 :
        System.out.println("sayinizin onlar basamagı alti");
        break;
    case 7 :
        System.out.println("sayinizin onlar basamagı yedi");
        break;
    case 8 :
        System.out.println("sayinizin onlar basamagı sekiz");
        break;
    case 9 :
        System.out.println("sayinizin onlar basamagı dokuz");
        break;

}
    }
}
