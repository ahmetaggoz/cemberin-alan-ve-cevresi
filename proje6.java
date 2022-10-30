package Giris;
import java.util.Scanner;
public class proje6 {
    public static void main(String[] args) {
        double yariCap,alan,cevre,pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çap değeri girin: ");
        yariCap = input.nextDouble();
        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;
        System.out.println("Çemberin alanı : " + alan);
        System.out.print("Çemberin çevresi : " + cevre);

    }
}
