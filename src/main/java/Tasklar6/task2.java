package Tasklar6;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("yasadiginiz gunu giriniz\npazartesi icin 1\nsali icin 2 \n" +
                "carsamba icin 3\npersembe icin 4\ncuma icin 5\ncumartesi icin 6\npazar icin 7 giriniz");
        int gun= input.nextInt();
        int yuzbirincigun=(gun+100)%7;

        switch (yuzbirincigun){
            case 0 :
                System.out.println("pazar");
                break;
            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("yanlıs bir rakam girdiniz");


        }

    }
}
