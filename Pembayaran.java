package PBOP4;

import java.util.Scanner;

public class Pembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka; 
        long totbel, uang;
        double total;
        System.out.print("Apakah Anda Memiliki Memiliki Kartu Member ? (ya = 1 / tidak = 0): ");
        angka = input.nextInt();
        if (angka == 1) {
            System.out.print("Total Belanja Anda : ");
            totbel = input.nextLong();
            if (totbel > 500000) {
                System.out.println("Selamat Anda Mendapat Diskon Sebesar 50.000 Rp");
                total = totbel - 50000;
                System.out.println("total : " + total);
                System.out.println("Uang Yang Dibayar : ");
                uang = input.nextLong();
                if (uang > total) {
                    System.out.println("Kembalian Anda " + (uang - total));
                    System.out.println("Terima Kasih Telah Berbelanja :)");
                }else if(uang < total){
                    System.out.println("Uang Anda Kurang : - " + (total - uang));
                }else if(uang == total){
                    System.out.println("Terima Kasih Telah Berbelanja :)");
                }
            }else if(totbel > 100000){
                System.out.println("Selamat Anda Mendapat Diskon Sebesar 15%");
                total = totbel * 0.15;
                System.out.println("total : " + total);
                System.out.println("Uang Yang Dibayar : ");
                uang = input.nextLong();
                if (uang > total) {
                    System.out.println("Kembalian Anda " + (uang - total));
                    System.out.println("Terima Kasih Telah Berbelanja :)");
                }else if(uang < total){
                    System.out.println("Uang Anda Kurang : - " + (total - uang));
                }else if(uang == total){
                    System.out.println("Terima Kasih Telah Berbelanja :)");
                }
            }  
        }else if(angka == 0){
          System.out.print("Total Belanja Anda : ");
          totbel = input.nextLong();
           total = totbel * 0.10;
                System.out.println("total : " + total);
                System.out.println("Uang Yang Dibayar : ");
                uang = input.nextLong();
                if (uang > total) {
                    System.out.println("Kembalian Anda " + (uang - total));
                    System.out.println("Terima Kasih Telah Berbelanja :)");
                }else if(uang < total){
                    System.out.println("Uang Anda Kurang : - " + (total - uang));
                }else if(uang == total){
                    System.out.println("Terima Kasih Telah Berbelanja :)");
                }    
        }else{
            System.out.println("Request Tidak Valid");
        }
        
}
}
