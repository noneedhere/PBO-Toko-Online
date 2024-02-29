/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_tokoonline;

/**
 *
 * @author Asus
 */
public class main {

    public static void main(String[] args) {
        
        Laporan report = new Laporan();
        Karyawan employee = new Karyawan();
        Barang item = new Barang();
        Transaksi transaction = new Transaksi();
        Member member = new Member();
        
        report.laporan(item);
        report.laporan(member);
        report.laporan(transaction, item);
        
        transaction.getTransaksi(member, transaction, item);
        
    }
}

