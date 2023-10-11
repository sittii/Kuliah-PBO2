/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoperhiasan.service;

import java.util.Date;

public class RiwayatTransaksi extends Transaksi {
    private String namaPerhiasan;
    private int jumlah;

    public RiwayatTransaksi(Date tanggalTransaksi, double totalHarga, String namaPerhiasan, int jumlah) {
        super(tanggalTransaksi, totalHarga);
        this.namaPerhiasan = namaPerhiasan;
        this.jumlah = jumlah;
    }

    public String getNamaPerhiasan() {
        return namaPerhiasan;
    }

    public void setNamaPerhiasan(String namaPerhiasan) {
        this.namaPerhiasan = namaPerhiasan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public void tampilkanDetailTransaksi() {
        System.out.println("Tanggal Transaksi: " + getTanggalTransaksi());
        System.out.println("Nama Perhiasan: " + namaPerhiasan);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: " + getTotalHarga());
    }
}
