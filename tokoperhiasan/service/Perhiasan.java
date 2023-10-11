/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoperhiasan.service;

import java.util.ArrayList;
import java.util.List;

public class Perhiasan {
    private static int jumlahTotalPerhiasan = 0;
    private final String nama;
    private double harga;
    private int stok;

    public Perhiasan(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahTotalPerhiasan += stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok() {
        if (stok > 0) {
            stok--;
        }
    }

    public static int getJumlahTotalPerhiasan() {
        return jumlahTotalPerhiasan;
    }
}
