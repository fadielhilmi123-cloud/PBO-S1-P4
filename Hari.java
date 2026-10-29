package PBOP4;

import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka;
        System.out.println("Insert Day Code : ");
        angka = input.nextInt();
        
        switch (angka) {
            case 1:
                System.out.println("Monday");
                System.out.println("Access Granted");
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println("Access Granted");
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println("Access Granted");
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println("Access Granted");
                break;
            case 5:
                System.out.println("Friday");
                System.out.println("Access Granted");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Access Granted");
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println("Access Granted");
                break;
            default:
                System.out.println("Code Do Not Exist");
        }
                
    }
   
}
