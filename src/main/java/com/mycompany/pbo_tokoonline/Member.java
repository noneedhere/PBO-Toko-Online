/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_tokoonline;

import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Member implements User{
    
    private ArrayList<String> namaMember = new ArrayList<String>();
        private ArrayList<String> alamat = new ArrayList<String>();
        private ArrayList<String> telepon = new ArrayList<String>();
        private ArrayList<Integer> saldo = new ArrayList<Integer>();
 
        public Member() {
            this.namaMember.add("Joy");
            this.alamat.add("Lumina");
            this.telepon.add("\t\t081869696969");
            this.saldo.add(100000);

            this.namaMember.add("Aldous");
            this.alamat.add("Kerajaan Minoan");
            this.telepon.add("\t081332375524");
            this.saldo.add(200000);

            this.namaMember.add("Roger");
            this.alamat.add("Megalith Wastelands");
            this.telepon.add("081966666666");
            this.saldo.add(200000);

            this.namaMember.add("Tigreal");
            this.alamat.add("Moniyan Empire");
            this.telepon.add("\t089572952333");
            this.saldo.add(200000);
        }
        public void setSaldo(int saldo){
            this.saldo.add(saldo);
        }
        public int getSaldo(int idMember){
            return this.saldo.get(idMember);
        }   
        public void editSaldo(int idMember, int saldo){
            this.saldo.set(idMember, saldo);;
        } 
        public int getJmlMember(){
            return this.saldo.size();
        } 
        @Override
        public void setNama(String namaMember ){
            this.namaMember.add(namaMember);
        }
 
        @Override
        public void setAlamat(String alamat ){
            this.alamat.add(alamat);
        }
        @Override
        public void setTelepon(String telepon ){
            this.telepon.add(telepon);
        }
 
        @Override
        public String getNama(int idMember){
            return this.namaMember.get(idMember);
        }
    
        @Override
        public String getAlamat(int idMember){
            return this.alamat.get(idMember);
        }
 
        @Override
        public String getTelepon(int idMember){
            return this.telepon.get(idMember);
        }
}
