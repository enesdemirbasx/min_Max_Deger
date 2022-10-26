import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max=0,min=999999999;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int say= inp.nextInt();
        for (int i=0;i<say;i++) {
            System.out.print(i+1 + ". sayıyı giriniz: ");
            int yenisayi = inp.nextInt();
            if (yenisayi > max) {
                max = yenisayi;
            } else {
                min = yenisayi;
            }
        }
            System.out.println("Girdiğiniz sayılardan en büyüğü: " + max);
            System.out.println("Girdiğiniz sayılardan en küçüğü: " + min);

    }
}