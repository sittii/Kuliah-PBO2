/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tokoperhiasan;

import com.mycompany.tokoperhiasan.service.Perhiasan;
import com.mycompany.tokoperhiasan.service.RiwayatTransaksi;
import com.mycompany.tokoperhiasan.service.Transaksi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TokoPerhiasan {
    private final List<Perhiasan> perhiasanList = new ArrayList<>();
    private final List<Transaksi> transaksiList = new ArrayList<>();

    public static void main(String[] args) {
        TokoPerhiasan tokoPerhiasan = new TokoPerhiasan();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Kelola Data Perhiasan");
            System.out.println("2. Kelola Transaksi");
            System.out.println("3. Keluar");

            System.out.print("Masukan pilihan menu : ");
            int pilihanMenuUtama = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihanMenuUtama) {
                case 1:
                    tokoPerhiasan.menuPerhiasan(scanner); 
                    break;
                case 2:
                    tokoPerhiasan.menuTransaksi(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih, program berakhir.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    public void menuTransaksi(Scanner scanner){
        while (true) {
            System.out.println("-----------------------");
            System.out.println("\nMenu Transaksi:");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Tampilkan Riwayat Transaksi");
            System.out.println("3. Kembali ke Menu Utama");

            System.out.print("Masukan pilihan menu : ");
            int pilihanMenuTransaksi = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihanMenuTransaksi) {
                case 1:
                    tambahTransaksi(); 
                    break;
                case 2:
                    tampilkanRiwayatTransaksi();
                    break;
                case 3:
                    return;  
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void menuPerhiasan(Scanner scanner) { 
        while (true) {
            System.out.println("-----------------------");
            System.out.println("\nMenu Perhiasan:");
            System.out.println("1. Tambah Data Perhiasan");
            System.out.println("2. Edit Data Perhiasan");
            System.out.println("3. Hapus Data Perhiasan");
            System.out.println("4. Tampilkan Data Perhiasan");
            System.out.println("5. Kembali ke Menu Utama");

            System.out.print("Masukan pilihan menu : ");
            int pilihanMenuPerhiasan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihanMenuPerhiasan) {
                case 1:
                    tambahPerhiasan(scanner); 
                    break;
                case 2:
                    editPerhiasan(scanner);
                    break;
                case 3:
                    hapusPerhiasan(scanner);
                    break;
                case 4:
                    tampilkanDataPerhiasan();
                    break;
                case 5:
                    return;  
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public void tambahPerhiasan(Scanner scanner) { 
        System.out.println("");
        System.out.print("Masukkan nama perhiasan : ");
        String namaPerhiasan = scanner.nextLine();
        System.out.print("Masukkan harga perhiasan : ");
        double hargaPerhiasan = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Masukkan stok perhiasan : ");
        int stokPerhiasan = scanner.nextInt();
        Perhiasan perhiasan = new Perhiasan(namaPerhiasan, hargaPerhiasan, stokPerhiasan);
        perhiasanList.add(perhiasan);
        System.out.println("Data perhiasan berhasil ditambahkan");
    }
    
    public void editPerhiasan(Scanner scanner) {
        System.out.println("");
        System.out.print("Masukkan nama perhiasan yang ingin diedit : ");
        String namaPerhiasan = scanner.nextLine();

        // Cari perhiasan dengan nama yang sesuai dalam perhiasanList
        for (Perhiasan perhiasan : perhiasanList) {
        if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
            System.out.print("Masukkan nama perhiasan baru : ");
            String namaBaru = scanner.nextLine();
            System.out.print("Masukkan harga perhiasan baru : ");
            double hargaBaru = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Masukkan stok perhiasan baru : ");
            int stokBaru = scanner.nextInt();

            perhiasan.setNama(namaBaru);
            perhiasan.setHarga(hargaBaru);
            perhiasan.setStok(stokBaru);
            System.out.println("Data perhiasan berhasil diupdate.");
            return;
        }
    }
    System.out.println("Perhiasan dengan nama " + namaPerhiasan + " tidak ditemukan.");
    }

    public void hapusPerhiasan(Scanner scanner) {
        System.out.println("");
        System.out.println("Masukkan nama perhiasan yang ingin dihapus : ");
        String namaPerhiasan = scanner.nextLine();

        // Cari perhiasan dengan nama yang sesuai dalam perhiasanList
        for (Perhiasan perhiasan : perhiasanList) {
            if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
                perhiasanList.remove(perhiasan);
                System.out.println("Data perhiasan berhasil dihapus");
                return;
            }
        }

        System.out.println("Perhiasan dengan nama " + namaPerhiasan + " tidak ditemukan.");
    }

    public void tampilkanDataPerhiasan() {
        System.out.println("");
        System.out.println("\nData Perhiasan:");
        for (Perhiasan perhiasan : perhiasanList) {
            System.out.println("Nama : " + perhiasan.getNama());
            System.out.println("Harga : " + perhiasan.getHarga());
            System.out.println("Stok : " + perhiasan.getStok());
            System.out.println("-----------------------");
        }
}
    public void tambahTransaksi() {
    System.out.println("");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();

    System.out.print("Masukan nama perhiasan: ");
    String namaPerhiasan = scanner.nextLine();

    System.out.print("Masukan jumlah yang dibeli: ");
    int jumlah = scanner.nextInt();
    scanner.nextLine();

    double totalHarga = hitungTotalHarga(namaPerhiasan, jumlah);

    for (Perhiasan perhiasan : perhiasanList) {
        if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
            int stokSekarang = perhiasan.getStok();
            
            if (stokSekarang >= jumlah) {
                perhiasan.setStok(stokSekarang - jumlah);
                System.out.println("Transaksi berhasil ditambahkan.");
                Transaksi transaksi = new RiwayatTransaksi(new Date(), totalHarga, namaPerhiasan, jumlah);
                transaksiList.add(transaksi);
            } else {
                System.out.println("Stok perhiasan tidak cukup untuk transaksi ini.");
            }
            break; 
        }
    }
}
    private double hitungTotalHarga(String namaPerhiasan, int jumlah) {
    for (Perhiasan perhiasan : perhiasanList) {
        if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
            double harga = perhiasan.getHarga();
            return harga * jumlah;
        }
    }
    return 0.0; 
}
    public void tampilkanRiwayatTransaksi() {
        System.out.println("\nRiwayat Transaksi:");
        for (Transaksi transaksi : transaksiList) {
            transaksi.tampilkanDetailTransaksi();
            System.out.println("-----------------------");
        }
    }

}
