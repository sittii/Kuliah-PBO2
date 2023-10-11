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

public final class TokoPerhiasan {
    private final List<Perhiasan> perhiasanList = new ArrayList<>();
    private final List<Transaksi> transaksiList = new ArrayList<>();

    public static void main(String[] args) {
        TokoPerhiasan tokoPerhiasan = new TokoPerhiasan();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n-----------------------");
            System.out.println(" ---- Menu Utama ---- ");
            System.out.println("-----------------------");
            System.out.println("1. Kelola Data Perhiasan");
            System.out.println("2. Kelola Transaksi");
            System.out.println("3. Keluar");
            System.out.println("-----------------------");

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

    public void menuPerhiasan(Scanner scanner) { 
        while (true) {
            System.out.println("\n-----------------------");
            System.out.println("--- Menu Perhiasan ---");
            System.out.println("-----------------------");
            int jumlahStokKeseluruhan = hitungJumlahStokKeseluruhan();
            System.out.println("Jumlah Stok Barang Keseluruhan : " + jumlahStokKeseluruhan);
            System.out.println("");
            System.out.println("1. Tambah Data Perhiasan");
            System.out.println("2. Edit Data Perhiasan");
            System.out.println("3. Hapus Data Perhiasan");
            System.out.println("4. Tampilkan Data Perhiasan");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.println("-----------------------");

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
        System.out.println("-----------------------");
        System.out.print("Masukkan nama perhiasan : ");
        String namaPerhiasan = scanner.nextLine();
        System.out.print("Masukkan harga perhiasan : ");
        double hargaPerhiasan = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Masukkan stok perhiasan : ");
        int stokPerhiasan = scanner.nextInt();
        Perhiasan perhiasan = new Perhiasan(namaPerhiasan, hargaPerhiasan, stokPerhiasan);
        perhiasanList.add(perhiasan);
        System.out.println("\n--- Data perhiasan berhasil ditambahkan! ---");
        tampilkanDataPerhiasan();
    }
    
    public void editPerhiasan(Scanner scanner) {
        System.out.println("");
        System.out.println("-----------------------");
        System.out.print("Masukkan nama perhiasan yang ingin diedit : ");
        String namaPerhiasan = scanner.nextLine();

        for (Perhiasan perhiasan : perhiasanList) {
        if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
            System.out.print("Masukkan harga perhiasan baru : ");
            double hargaBaru = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Masukkan stok perhiasan baru : ");
            int stokBaru = scanner.nextInt();
            perhiasan.setHarga(hargaBaru);
            perhiasan.setStok(stokBaru);
            System.out.println("\n --- Data perhiasan berhasil diupdate! ---");
            tampilkanDataPerhiasan();
            return;
        }
    }
    System.out.println("Perhiasan dengan nama " + namaPerhiasan + " tidak ditemukan.");
    }

    public void hapusPerhiasan(Scanner scanner) {
        System.out.println("");
        tampilkanDataPerhiasan();
        System.out.println("-----------------------");
        System.out.print("Masukkan nama perhiasan yang ingin dihapus : ");
        String namaPerhiasan = scanner.nextLine();

        // Cari perhiasan dengan nama yang sesuai dalam perhiasanList
        for (Perhiasan perhiasan : perhiasanList) {
            if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
                perhiasanList.remove(perhiasan);
                System.out.println("\n --- Data perhiasan berhasil dihapus ---");
                tampilkanDataPerhiasan();
                return;
            }
        }
        System.out.println("Perhiasan dengan nama " + namaPerhiasan + " tidak ditemukan.");
    }

    public void tampilkanDataPerhiasan() {
        System.out.println("\n-----------------------");
        System.out.println("Data Perhiasan ");
        System.out.println("-----------------------");
        for (Perhiasan perhiasan : perhiasanList) {
            System.out.println("Nama : " + perhiasan.getNama());
            System.out.println("Harga : " + perhiasan.getHarga());
            System.out.println("Stok : " + perhiasan.getStok());
            System.out.println("-----------------------");
        }
}
    public void menuTransaksi(Scanner scanner){
        while (true) {
            System.out.println("\n-----------------------");
            System.out.println("--- Menu Transaksi ---");
            System.out.println("-----------------------");
            System.out.println("1. Tambah Transaksi");
            System.out.println("2. Tampilkan Riwayat Transaksi");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.println("-----------------------");

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
    
    public void tambahTransaksi() {
    Scanner scanner = new Scanner(System.in);
    tampilkanDataPerhiasan();
    System.out.println("");
    System.out.println("-----------------------");
    System.out.print("Masukan nama perhiasan: ");
    String namaPerhiasan = scanner.nextLine();
    System.out.print("Masukan jumlah yang dibeli: ");
    int jumlah = scanner.nextInt();
    scanner.nextLine();

    double totalHarga = 0;
    boolean perhiasanDitemukan = false;

    for (Perhiasan perhiasan : perhiasanList) {
        if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
            int stokSekarang = perhiasan.getStok();
            
            if (stokSekarang >= jumlah) {
                perhiasan.setStok(stokSekarang - jumlah);
                totalHarga = hitungTotalHarga(namaPerhiasan, jumlah);
                Transaksi transaksi = new RiwayatTransaksi(new Date(), totalHarga, namaPerhiasan, jumlah);
                transaksiList.add(transaksi);
                System.out.println("\n --- Transaksi berhasil ditambahkan! ---");
            } else {
                System.out.println("Stok perhiasan tidak cukup untuk transaksi ini.");
            }
            
            perhiasanDitemukan = true;
            break;
        }
    }

    if (!perhiasanDitemukan) {
        System.out.println("Barang tidak ditemukan.");
    }
}

    private final double hitungTotalHarga(final String namaPerhiasan, final int jumlah) {
        for (Perhiasan perhiasan : perhiasanList) {
            if (perhiasan.getNama().equalsIgnoreCase(namaPerhiasan)) {
                final double harga = perhiasan.getHarga();
                return harga * jumlah;
            }
        }
        return 0.0;
    }
    public void tampilkanRiwayatTransaksi() {
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("\nRiwayat Transaksi ");
        System.out.println("-----------------------");
        
        for (Transaksi transaksi : transaksiList) {
            transaksi.tampilkanDetailTransaksi();
            System.out.println("-----------------------");
        }
    }
    
    public int hitungJumlahStokKeseluruhan() {
        int totalStok = 0;
        for (Perhiasan perhiasan : perhiasanList) {
            totalStok += perhiasan.getStok();
        }
        return totalStok;
    }

}
