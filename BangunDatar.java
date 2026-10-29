package PBOP4;

import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opsi, a, b, t, d1, d2, r, s;
        double hasil;
        System.out.println("Luas Bangun Datar : "
        + "\n1. Luas Persegi"
        + "\n2. segitiga"
        + "\n3. Lingkaran"
        + "\n4. Trapesium"
        + "\n5. Lingkaran"
        + "\nMasukkan Kode Bangun Datar : " );
        opsi = input.nextInt();
        
        switch (opsi) {
            case 1:
                System.out.println("=== Luas Persegi ===");
                System.out.print("Masukkan Sisi : ");
                s = input.nextInt();
                hasil = s * s;
                System.out.println("Hasil : " + hasil);
                System.out.println("====================");
                break;
            case 2:
                System.out.println("=== Luas Segitiga ===");
                System.out.print("Masukkan Alas : ");
                a = input.nextInt();
                System.out.print("Masukkan Tinggi : ");
                t = input.nextInt();
                hasil = 0.5 * a * t;
                System.out.println("Hasil : " + hasil);
                System.out.println("=====================");
                break;
            case 3:
                double pi = 3.14;
                System.out.println("=== Luas Lingkaran ===");
                System.out.print("Masukkan Jari - Jari : ");
                r = input.nextInt();
                hasil = pi * r * r;
                System.out.println("Hasil : " + hasil);
                System.out.println("======================");
                break;
            case 4:
                System.out.println("=== Luas Trapesium ===");
                System.out.print("Masukkan Sisi a : ");
                a = input.nextInt();
                System.out.print("Masukkan Sisi b : ");
                b = input.nextInt();
                System.out.print("Masukkan tinggi : ");
                t = input.nextInt();
                hasil = 0.5 * (a * b)  * t;
                System.out.println("Hasil : " + hasil);
                System.out.println("======================");
                break;
            case 5: 
                System.out.println("=== Luas Layang - Layang ===");
                System.out.print("Masukkan d1 : ");
                d1 = input.nextInt();
                System.out.print("Masukkan d2 : ");
                d2 = input.nextInt();
                hasil = 0.5 * d1 * d2;
                System.out.println("Hasil : " + hasil);
                System.out.println("=============================");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
