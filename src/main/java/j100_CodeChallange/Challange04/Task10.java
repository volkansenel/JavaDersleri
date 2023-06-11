package j100_CodeChallange.Challange04;

public class Task10 {


        // Task-> "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel"
    // seklinde print eden code create ediniz.

    public static void main(String[] args) {
        String cumle="   Java ogrenmek123 Cok guzel@      ";
        String cumle1=cumle.replaceAll("\\d","");
        String cumle2=cumle1.replace("@","");
        String cumle3=cumle2.replace("C","c");
        String cumle4=cumle3.trim();
        System.out.println(cumle4);

    }

}
