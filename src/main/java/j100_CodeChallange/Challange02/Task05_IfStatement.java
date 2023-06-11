package j100_CodeChallange.Challange02;

import java.util.Scanner;

public class Task05_IfStatement {
    /* Task->
    Girilen jobTitle data için : Eger jobTitle
    qa ise print "is unvaniniz Quality Analyst."
    dev ise print "is unvaniniz Developer."
    ba ise print "is unvaniniz Business Analyst."
    pm ise print "is unvaniniz Project Manager."
    code create ediniz...
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jobtitle datanızı giriniz\nQuality Analyst için 1\nDeveloper için 2\n" +
                "Business Analyst için 3\nProject Manager için 4 giriniz ");
        int joptitle = input.nextInt();
        if (joptitle == 1) {
        System.out.println("is unvaniniz Quality Analyst");}
       else if (joptitle == 2){
            System.out.println("is unvaniniz Developer");}
        else if (joptitle == 3) {
            System.out.println("is unvaniniz Business Analyst");}
        else if (joptitle == 4) {
            System.out.println("is unvaniniz Project Manager");
        }
        else {
            System.out.println("yanlış bir giriş yaptınız");
        }

    }

}
