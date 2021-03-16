package me.andreemeilio.classes;

import java.util.ArrayList;

public class Transaksi {
    private String noTransaksi, namaPesanan, tanggal, noMeja;
    private ArrayList<Pesanan> pesanan;
    private double uangBayar, pajak, totalBayar;
    private double biayaService = 0;


    public Transaksi(String no_transaksi, String nama_pemesan, String tanggal, String no_meja){
        this.noTransaksi = no_transaksi;
        this.namaPesanan = nama_pemesan;
        this.tanggal = tanggal;
        this.noMeja = no_meja;

        pesanan = new ArrayList<>();
    }


    public void tambahPesanan(Pesanan pesanan){
        this.pesanan.add(pesanan);
    }

    // public Pesanan getPesanan(){
    //     return null;
    // }

    public ArrayList<Pesanan> getSemuaPesanan(){
        return pesanan;
    }

    public double hitungTotalBayar(){
        return 0;
    }

    public double hitungKembalian(){
        return 0;
    }

    public void cetakStruk(){
        System.out.println("\n======== ALDEBARAMEN ========");
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("Pemesan : " + namaPesanan);
        System.out.println("Tanggal : " + tanggal);

        //cek jika nomor meja kosong, berarti take away
        if (noMeja.equals("")){
            noMeja = "Take Away";
        }

        System.out.println("Meja : " + noMeja);
        System.out.println("=============================");
        for (int i = 0; i < pesanan.size(); i++){
            Pesanan psn = pesanan.get(i);
            Menu m = psn.getMenu();
            String pesanan = psn.getJumlah() + " " + m.getNama_menu() + "\t" + (m.getHarga() * psn.getJumlah());

            if (m.getKategori().equals("Kuah")){
                pesanan = " " + pesanan;
            }

            System.out.println(pesanan);
        }
    }
}
