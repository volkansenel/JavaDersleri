package Tasklar6;

import java.util.Scanner;

public class atmsorusu {
    public static void main(String[] args) {
        String Sifre="1234";
        Scanner input=new Scanner(System.in);
        System.out.println("yatırım banka hoş geldiniz");
        System.out.println("şifrenizi giriniz");
        String sifre= input.next();
        if(sifre.equals(Sifre)) {
            System.out.println("bankamıza hoş geldiniz");

            System.out.println("bakiye sorgulamak için 1\npara yatırmak için 2\npara çekmek için 3\nçıkış için 4\n tuşlayınız");
            int secim = input.nextInt();
            int bakiye=1000;
            switch (secim) {
                case 1 :
                    System.out.println("bakiyeniz = " + bakiye);
                    break;
                case 2 :
                    System.out.println("yatırılacak tutarı giriniz");
                    int yatirilacaktutar= input.nextInt();
                    bakiye+=yatirilacaktutar;
                    System.out.println("guncel bakiyeniz = " + bakiye);
                    break;
                case 3 :
                    System.out.println("ne kadar para cekeceksiniz");
                    int cekilecektutar= input.nextInt();
                    if (cekilecektutar>=bakiye){
                        System.out.println("yetersiz bakiye yeni bir tutar giriniz");
                    }else{
                        bakiye-=cekilecektutar;
                        System.out.println("yeni bakiyeniz = " + bakiye);
                    }
                    break;
                case 4 :
                    System.out.println("cıkış işlemi yapıyorsunuz.hoşçakalın");
                    break;
                default:
                    System.out.println("yanlış bir seçim yaptınız tekrar deneyiniz");
                    break;

            }
        }else System.out.println("yanliş şifre girdiniz tekrar deneyiniz");



    }
}
