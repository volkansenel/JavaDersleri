package Tasklar;

public class calisma1 {
    public static void main(String[] args) {
        String name="volkan";
        String adSoyad="volkan senel";
        int num=12345;
        String number="1234";
        System.out.println(name+adSoyad);
        System.out.println("name.concat(adSoyad) = " + name.concat(adSoyad));
        System.out.println("Integer.parseInt(number+1) = " + (Integer.parseInt(number+1) +1));
        System.out.println(number+10);
        System.out.println("Integer.valueOf(number) = " + (Integer.valueOf(number)+10));
        System.out.println("name.charAt(name.length()-3) = " + name.charAt(name.length() - 3));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length() - 1));
    }
}
