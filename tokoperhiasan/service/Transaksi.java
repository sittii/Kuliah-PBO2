/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoperhiasan.service;

import java.util.Date;

public abstract class Transaksi {
    private Date tanggalTransaksi;
    private double totalHarga;

    public Transaksi(Date tanggalTransaksi, double totalHarga) {
        this.tanggalTransaksi = tanggalTransaksi;
        this.totalHarga = totalHarga;
    }

    // Getter dan Setter

    public Date getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(Date tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    // Abstrak method yang akan diimplementasikan di kelas turunan
    public abstract void tampilkanDetailTransaksi();
}

