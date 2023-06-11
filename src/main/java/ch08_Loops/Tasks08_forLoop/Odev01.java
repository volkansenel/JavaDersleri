package ch08_Loops.Tasks08_forLoop;

public class Odev01 {

    public static void main(String[] args) {

        //    0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        //Kodu aşağıya yazınız.
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + "");


        }
        int j;
        for(j=0;j<=100;j++){
            if (j%2==0){
                System.out.print("\n"+j+"");
            }
        }
    }
}