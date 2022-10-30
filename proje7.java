package Giris;
import java.util.Scanner;
public class proje7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,a;
        double pi = 3.14,alan;
        System.out.print("Yarıçap bilgisi girin: ");
        r = input.nextInt();
        System.out.print("Açı bilgisi girin : ");
        a = input.nextInt();
        alan = (pi * (r * r) * a) / 360;
        System.out.print("Alan : " + alan);
    }
}
