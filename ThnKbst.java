package PBOP4;

import java.util.Scanner;

public class ThnKbst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t;
        
        System.out.println("Masukkan Tahun (4 Digit) : ");
        t = input.nextInt();
        
        if (t % 400 == 0) {
            System.out.println(t + " Adalah Tahun Kabisat");
        }else if (t % 100 == 0){
            System.out.println(t + " Bukan Tahun Kabisat");
        }else if (t % 4 == 0){
            System.out.println(t + " Adalah Tahun Kabisat");           
        }else{
            System.out.println(t + " Bukan Tahun Kabisat");            
        }
    }
}
