package com.mycompany.pbo_tokoonline;

import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Barang {
    
    private ArrayList<String> namaBarang = new ArrayList<String>();
        private ArrayList<Integer> stok = new ArrayList<Integer>();
        private ArrayList<Integer> harga = new ArrayList<Integer>();
 
    public Barang() {
        this.namaBarang.add("Blade of Demon");
        this.stok.add(15);
        this.harga.add(10000);
        this.namaBarang.add("Hunter Strike");
        this.stok.add(30);
        this.harga.add(5000);
        this.namaBarang.add("Immortal");
        this.stok.add(20);
        this.harga.add(15000);
        }
        public int getJmlBarang(){
            return this.namaBarang.size();
        }
        public void setNamaBarang(String namaBarang ){
            this.namaBarang.add(namaBarang);
        }
        public String getNamaBarang(int idBarang){
            return this.namaBarang.get(idBarang);
        } 

        public void setStok(int stok ){
            this.stok.add(stok);
        }
        public int getStok(int idBarang){
            return this.stok.get(idBarang);
        } 
        public void editStok(int idBarang, int stok){
            this.stok.set(idBarang, stok);;
        } 
        public void setHarga(int harga ){
            this.harga.add(harga);
        }
        public int getHarga(int idBarang){
            return this.harga.get(idBarang);
        } 

}
