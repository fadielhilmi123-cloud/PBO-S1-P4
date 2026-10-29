package PBOP4;

import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
     int  jasa;
     long sale;
     double komis;
     
        System.out.print("Masukkan Nominal Penjualan Barang : ");
        sale = input.nextInt();
        if (sale == 2000000) {
            jasa = 100000;
            komis = 0.10 * sale;
            System.out.println("Uang Jasa Anda : " + jasa);
            System.out.println("Uang Komisi Anda : " + komis);
            System.out.println("Total Pendapatan Anda : " + (jasa + komis));
        }else if(sale > 2000000 && sale == 5000000){
            jasa = 200000;
            komis = 0.15 * sale;
            System.out.println("Uang Jasa Anda : " + jasa);
            System.out.println("Uang Komisi Anda : " + komis);
            System.out.println("Total Pendapatan Anda : " + (jasa + komis));
        }else if(sale > 5000000){
            jasa = 300000;
            komis = 0.20 * sale;
            System.out.println("Uang Jasa Anda : " + jasa);
            System.out.println("Uang Komisi Anda : " + komis);
            System.out.println("Total Pendapatan Anda : " + (jasa + komis));
            System.out.println("KEEP UP THE GOOD WORK !!!");
        }else{
            System.out.println("Tidak Mencapai Target Dimohon Untuk Memperbaiki Kinerja");
        }
    }
        
    }
