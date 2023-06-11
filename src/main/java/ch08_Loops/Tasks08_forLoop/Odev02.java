package ch08_Loops.Tasks08_forLoop;

public class Odev02 {

    public static void main(String[] args) {

        /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */

        //Kodu aşağıya yazınız.

for (int i=0;i<=100;i+=20) {
    System.out.println(i+"");

        }
int j;
for (j=0;j<=100;j++){
    if (j%20==0){
        System.out.println("j = " + j);
    }
}




    }
}
