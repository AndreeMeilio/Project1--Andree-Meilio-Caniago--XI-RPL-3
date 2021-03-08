package me.andreemeilio.main;

import java.util.Scanner;

import me.andreemeilio.classes.DaftarMenu;
import me.andreemeilio.classes.Kuah;
import me.andreemeilio.classes.Minuman;
import me.andreemeilio.classes.Ramen;
import me.andreemeilio.classes.Toping;


public class MainAplikasiKasir {
    public DaftarMenu daftarMenu;

    public static final double PAJAK_PPN = 0.10;
    public static final double BIAYA_SERVICE = 0.05;

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String no_transaksi, nama_pemesan, tanggal, no_meja = "";
        String transaksi_lagi = "", pesan_lagi = "", keterangan = "", makan_ditempat;
        int jumlah_pesanan, no_menu;   

        MainAplikasiKasir app = new MainAplikasiKasir();
        app.generateDaftarMenu();

        System.out.println("========== TRANSAKSI ==========");

        System.out.println("No Transaksi : ");
        no_transaksi = input.next();
        System.out.println("Pemesan : ");
        nama_pemesan = input.next();
        System.out.println("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.println("Makan di tempat? [Y/N] ");
        makan_ditempat = input.next();

        if (makan_ditempat.equalsIgnoreCase("Y")){
            System.out.println("Nomor Meja : ");
            no_meja = input.next();
        }

    }

    public void generateDaftarMenu(){
        daftarMenu = new DaftarMenu();

        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));

        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));

        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5000));

        daftarMenu.tambahMenu(new Minuman("Jus Alpukat SPC", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));

        daftarMenu.tampilDaftarMenu();
    }
}
