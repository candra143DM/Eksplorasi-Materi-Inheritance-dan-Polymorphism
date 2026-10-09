import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.print("menu: \n1. Perlihatkan dengan nilai default\n2. Isi nilai sendiri \n0. Keluar\nPilih menu: ");
            choice = input.nextInt();
            input.nextLine(); //ini kayak yang buat hapus sisa di c++ tapi beda nama aja kayaknya 
            if (choice == 1) {
                Bentuk bentuk = new Bentuk("Merah");
                bentuk.printInfo();
                System.out.println();
                BujurSangkar A1 = new BujurSangkar(5.0, "kuning");
                A1.printInfo();
                System.out.println();
                Lingkaran A2 = new Lingkaran(7.0, "Hijau");
                A2.printInfo();
                System.out.println();
                Silinder A3 = new Silinder(7.0, 10.0, "Kuning");
                A3.printInfo();
            }
            else if (choice == 2) {     
                System.out.print("Masukkan warna bentuk: ");
                String warna = input.nextLine();
                Bentuk bentuk = new Bentuk(warna);
                bentuk.printInfo();
                System.out.println();
                System.out.print("Masukkan sisi bujur sangkar: ");
                double sisi = input.nextDouble();
                input.nextLine();
                System.out.print("Masukkan warna bujur sangkar: ");
                String warnaBujur = input.nextLine();
                BujurSangkar A1 = new BujurSangkar(sisi, warnaBujur);
                A1.printInfo();
                System.out.println();
                System.out.print("Masukkan radius lingkaran: ");
                double radius = input.nextDouble();
                input.nextLine();
                System.out.print("Masukkan warna lingkaran: ");
                String warnaLingkaran = input.nextLine();
                Lingkaran A2 = new Lingkaran(radius, warnaLingkaran);
                A2.printInfo();
                System.out.println();
                System.out.print("Masukkan radius silinder: ");
                double radSilinder = input.nextDouble();
                System.out.print("Masukkan tinggi silinder: ");
                double tinggi = input.nextDouble();
                input.nextLine();
                System.out.print("Masukkan warna silinder: ");
                String warnaSilinder = input.nextLine();
                Silinder A3 = new Silinder(radSilinder, tinggi, warnaSilinder);
                A3.printInfo();
            }
            else if (choice == 0) {
                System.out.println("Keluar dari game...");
            }
            else {
                System.out.println("Pilihan tidak valid!");
            }
        }while (choice != 0);    
        input.close();
    }
}