package PBOP4;

import java.util.Scanner;

public class GenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        
        System.out.println("Masukkan Angka : ");
        a = input.nextInt();
        
        if (a % 2 == 0) {
            System.out.println("INI BILANGAN GENAP");
        }else{
            System.out.println("INI BILANGAN GANJIL");
        }
    }
}
