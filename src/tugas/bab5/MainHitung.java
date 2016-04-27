package mainhitung;

import java.util.Scanner;

public class MainHitung {
    
static double k, l, i;
    
public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        Penghitung mesin = new Penghitung();
        do {
            System.out.println("");
            System.out.println("===============");
            System.out.println("Menu Aritmatika");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("0. Out");
            System.out.println("===============");
            System.out.print("Pilihan anda    : ");
            i = in.nextInt();
            if (i == 0) {
                System.out.print("Program Selesai ");
            } else if (i == 1) {
              System.out.print("Masukkan angka Pertama  : ");
                k = in.nextDouble();
              System.out.print("Masukkan angka Keedua   : ");
                l = in.nextDouble();
                Penghitung.Penjumlahan(k, l);
                mesin.sederhana();
            } else if (i == 2) {
              System.out.print("Masukkan angka Pertama  : ");
                k = in.nextDouble();
              System.out.print("Masukkan angka Keedua   : ");
                l = in.nextDouble();
                Penghitung.Pengurangan(k, l);
                mesin.sederhana();
            } else if (i == 3) {
              System.out.print("Masukkan angka Pertama  : ");
                k = in.nextDouble();
             System.out.print("Masukkan angka Keedua   : ");
                l = in.nextDouble();
                mesin.perkalian(k, l);
                mesin.sederhana();
            } else if (i == 4) {
              System.out.print("Masukkan angka Pertama  : ");
                k = in.nextDouble();
              System.out.print("Masukkan angka Keedua   : ");
                l = in.nextDouble();
                mesin.pembagian(k, l);
                mesin.sederhana();
            }
        } while (i != 0);
    }
}
