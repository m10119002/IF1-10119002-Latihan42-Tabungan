/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan42;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Class untuk objek Tabungan
 * 
 * 
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {this.saldo = saldo;}
    public int ambilUang(int jumlah) {
        this.saldo -= jumlah;
        return this.saldo;
    }
}
