package PBOP4;

import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String nama;
     int angka, nik, kode, anak;
     long gaji;
     double t, ta, ts;
     
        System.out.print("Masukkan Nama Karyawan : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIK : ");
        nik = input.nextInt();
        System.out.print("Kode Golongan : ");
        kode = input.nextInt();
        switch (kode) {
            case 1:
                System.out.println("Keterangan : Menikah");
                gaji = 1500000;
                System.out.println("Gaji Pokok Karyawan : " + gaji);
                System.out.println("Jumlah Anak : - ");
                System.out.println("Gaji Pokok Karyawan : " + gaji);
                ta = 0;
                ts = 0;
                t = 0;
                System.out.println("Gaji bersih : " + (gaji + t));
                System.out.println("Tunjangan : " + t);
                System.out.println("Tunjangan Pasangan: " + ts);
                System.out.println("Tunjangan Anak: " + ta);
            case 2:
                System.out.println("Keterangan : Belum Menikah");
                gaji = 1200000;
                System.out.println("Gaji Pokok Karyawan : " + gaji);
                System.out.println("Jumlah Anak : - ");
                System.out.println("Gaji Pokok Karyawan : " + gaji);
                ta = 0;
                ts = 0;
                t = 0;
                System.out.println("Gaji bersih : " + (gaji + t));
                System.out.println("Tunjangan : " + t);
                System.out.println("Tunjangan Pasangan: " + ts);
                System.out.println("Tunjangan Anak: " + ta);
                break;
            case 3:
                System.out.println("Keterangan : Cerai");
                gaji = 1750000;
                System.out.println("Gaji Pokok Karyawan : " + gaji);
                System.out.println("Jumlah Anak : - ");
                System.out.println("Gaji Pokok Karyawan : " + gaji);
                ta = 0;
                ts = 0;
                t = 0;
                System.out.println("Gaji bersih : " + (gaji + t));
                System.out.println("Tunjangan : " + t);
                System.out.println("Tunjangan Pasangan: " + ts);
                System.out.println("Tunjangan Anak: " + ta);
                break;
            case 4:
                System.out.println("Keterangan : Menikah Dan Punya Anak");
                System.out.print("Jumlah Anak : ");
                anak = input.nextInt();
                gaji = 2000000;
                System.out.println("Gaji Pokok Karyawan : " + gaji);
                ta = (gaji * 0.05) * anak;
                ts = gaji * 0.1;
                t = ta + ts;
                System.out.println("Gaji bersih : " + (gaji + t));
                System.out.println("Tunjangan : " + t);
                System.out.println("Tunjangan Pasangan: " + ts);
                System.out.println("Tunjangan Anak: " + ta);
                
                break;    
            default:
                System.out.println("data tidak valid");
        }
        
    }    
}
