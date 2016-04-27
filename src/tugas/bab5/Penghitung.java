package mainhitung;

public class Penghitung {

    static double nilai;

    public static void Penjumlahan(double a, double b) {
        nilai = a + b;
     System.out.println("Nilai Penjumlahan adalah: " + nilai);
    }

    public static void Pengurangan(double a, double b) {
        nilai = a - b;
     System.out.println("Nilai Pengurangan adalah        : " + nilai);
    }

    public void perkalian(double a, double b) {
        nilai = a * b;
     System.out.println("Nilai Perkalian adalah  : " + nilai);
    }

    public void pembagian(double a, double b) {
        nilai = a / b;
     System.out.println("Nilai Pembagian adalah  : " + nilai);
    }

    public void sederhana() {
        double h = nilai % 1;

        if (h <= 0.5) {
     System.out.println("Nilai Sederhana: " + (nilai - h));
        } else if (h > 0.5 || h < 1) {
     System.out.println("Nilai Sederhana: " + (nilai - h + 1));
        }
    }
}
