package mainbarang;

import java.util.Scanner;

public class MainBarang {

    static int g, f;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Barang brg = new Barang();
        do {
            System.out.println("Menu Barang");
            System.out.println("1. Jaket A");
            System.out.println("2. Jaket B");
            System.out.println("3. Jaket C");
            System.out.println("0. Out");
            System.out.print("Masukkan Pilihan    : ");
            g = scn.nextInt();
            if (g == 1) {
              System.out.print("Masukkan Jumlah barang  : ");
                g = scn.nextInt();
                brg.setBrg(g);
                if (g <= 100) {
                    brg.hitunghargaa(brg.getBrg());
                } else {
                    brg.hitungdiskona(brg.getBrg());
                }
            } else if (g == 2) {
              System.out.print("Masukkan Jumlah barang  : ");
                g = scn.nextInt();
                brg.setBrg(g);
                if (g <= 100) {
                    brg.hitunghargab(brg.getBrg());
                } else {
                    brg.hitungdiskonb(brg.getBrg());
                }
            } else if (g == 3) {
              System.out.print("Masukkan Jumlah barang  : ");
                g = scn.nextInt();
                brg.setBrg(g);
                if (g <= 100) {
                    brg.hitunghargac(brg.getBrg());
                } else {
                    brg.hitungdiskonc(brg.getBrg());
                }
            } else if (g == 0) {
                System.out.println("Stopped !!");
            }
        } while (g != 0);
    }
}
