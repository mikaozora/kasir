/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepatu;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author ASUS GAMING PC
 */
public class sepatu {

    private String warna;
    private String jenis;
    private String kategori;
    private String merk;
    private int harga;
    private String nama;
    private int size;
    Scanner baru = new Scanner(System.in);
    Scanner baru1 = new Scanner(System.in);

    public void sepatu(int jenis, int kategori, int warna, int merk, int size, String nama) {
        int harga = 0;
        System.out.print("Nama pembeli = > ");
        this.nama = nama = baru.nextLine();
        System.out.print("========JENIS====== \n[1] Cowok\n[2] Cewek\n=> ");
        jenis = baru.nextInt();
        if (jenis == 1) {
            this.jenis = "Cowok";
        } else if (jenis == 2) {
            this.jenis = "Cewek";    
        } else {
            System.out.println("Maaf cuma tersedia 2");
        }

        System.out.print("========KATEGORI======= \n[1] Olahraga\n[2] Lari\n[3] Santai\n[4] Kantoran\n=> ");
        kategori = baru.nextInt();
        if (kategori == 1) {
            this.kategori = "Olahraga";
        } else if (kategori == 2) {
            this.kategori = "Lari";
        } else if (kategori == 3) {
            this.kategori = "Santai";
        } else if (kategori == 4) {
            this.kategori = "Kantoran";
        }
        System.out.print("========MERK========\n[1] 910\n[2] Adidas\n[3] Nike\n[4] Skechers\n[5] Puma\n[6] Reebok\n[7] Vans\n[8] Converse\n[9] Fila\n => ");
        merk = baru1.nextInt();
        if (merk == 1) {
            this.merk = "910";
            harga = 200000;
        } else if (merk == 2) {
            this.merk = "Adidas";
            harga = 900000;
        } else if (merk == 3) {
            this.merk = "Nike";
            harga = 950000;
        } else if (merk == 4) {
            this.merk = "Skechers";
            harga = 800000;
        } else if (merk == 5) {
            this.merk = "Puma";
            harga = 750000;
        } else if (merk == 6) {
            this.merk = "Reebok";
            harga = 600000;
        } else if (merk == 7) {
            this.merk = "Vans";
            harga = 500000;
        } else if (merk == 8) {
            this.merk = "Converse";
            harga = 550000;
        } else if (merk == 9) {
            this.merk = "Fila";
            harga = 400000;
        } else {
            System.out.println("Maaf hanya tersedia itu saja");
        }
        this.harga = harga;
        System.out.print("========WARNA========= \n[1] Black\n[2] White\n[3] Gold\n[4] Silver\n[5] Orange\n[6] Green\n[7] Yellow\n[8] Blue\n[9] Red\n=> ");
        warna = baru.nextInt();
        if (warna == 1) {
            this.warna = "Black";
        } else if (warna == 2) {
            this.warna = "White";
        } else if (warna == 3) {
            this.warna = "Gold";
        } else if (warna == 4) {
            this.warna = "Silver";
        } else if (warna == 5) {
            this.warna = "Orange";
        } else if (warna == 6) {
            this.warna = "Green";
        } else if (warna == 7) {
            this.warna = "Yellow";
        } else if (warna == 8) {
            this.warna = "Blue";
        } else if (warna == 9) {
            this.warna = "Red";
        } else {
            System.out.println("Maaf hanya tersedia itu saja");
        }
        System.out.print("========SIZE========= \n Ingin size berapa? (25-34)\n => ");
        this.size = size = baru1.nextInt();
        
    }

    public void hasil() {
        System.out.println("====== JAYA BARU SPORT STATION ======");
        System.out.println("Jl. doang jadian enggak");
        System.out.println("----------------------------------------");
        System.out.println("Tanggal\t " + getTanggal());
        System.out.println("Waktu\t " + getWaktu());
        System.out.println("----------------------------------------");
        System.out.println("Nama pembeli\t "+this.nama);
        System.out.println("Jenis sepatu\t " + this.jenis);
        System.out.println("Kategori sepatu\t " + this.kategori);
        System.out.println("Merk sepatu\t " + this.merk);
        System.out.println("Warna sepatu\t " + this.warna);
        System.out.println("Size sepatu\t " + this.size);
        System.out.println("Harga sepatu\t " + this.harga);
        System.out.println("----------------------------------------");
        System.out.println("-------------TERIMA KASIH---------------");

    }

    public void hasildiskon() {
        System.out.println("====== JAYA BARU SPORT STATION ======");
        System.out.println("Jl. doang jadian enggak");
        System.out.println("----------------------------------------");
        System.out.println("Tanggal\t " + getTanggal());
        System.out.println("Waktu\t " + getWaktu());
        System.out.println("----------------------------------------");
        System.out.println("Nama pembeli\t "+this.nama);
        System.out.println("Jenis sepatu\t " + this.jenis);
        System.out.println("Kategori sepatu\t " + this.kategori);
        System.out.println("Merk sepatu\t " + this.merk);
        System.out.println("Warna sepatu\t " + this.warna);
        System.out.println("Size sepatu\t " + this.size);
        System.out.println("Harga sepatu\t " + this.harga);
        int temp = this.harga * 2 - 50000;
        this.harga = temp;
        System.out.println("Karena beli 2 pasang, Anda mendapatkan diskon Rp. 50.000");
        System.out.println("Total harga\t " + this.harga);
        System.out.println("----------------------------------------");
        System.out.println("-------------TERIMA KASIH---------------");
    }

    public void hasildiskon3() {
        System.out.println("====== JAYA BARU SPORT STATION ======");
        System.out.println("Jl. doang jadian enggak");
        System.out.println("----------------------------------------");
        System.out.println("Tanggal\t "+getTanggal());
        System.out.println("Waktu\t "+getWaktu());
        System.out.println("----------------------------------------");
        System.out.println("Nama pembeli\t "+this.nama);
        System.out.println("Jenis sepatu\t " + this.jenis);
        System.out.println("Kategori sepatu\t " + this.kategori);
        System.out.println("Merk sepatu\t " + this.merk);
        System.out.println("Warna sepatu\t " + this.warna);
        System.out.println("Size sepatu\t " + this.size);
        System.out.println("Harga sepatu\t " + this.harga);
        int temp = this.harga * 3 - 100000;
        this.harga = temp;
        System.out.println("Karena beli 3 pasang, Anda mendapatkan diskon Rp. 100.000");
        System.out.println("Total harga\t " + this.harga);
        System.out.println("----------------------------------------");
        System.out.println("-------------TERIMA KASIH---------------");
    }

    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
