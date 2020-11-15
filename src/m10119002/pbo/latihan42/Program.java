/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan42;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program tabungan
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    private static Scanner scanner = new Scanner(System.in);
    private static String input = new String();
    private static boolean status;
    private static Tabungan tabungan;
	
    private static boolean cekParsing(String test) {
        try {
            Integer.parseInt(test);
            return true;
        } catch (NumberFormatException ex) {
            System.err.println("Pastikan tidak mengandung huruf atau simbol!");
            return false;
        } catch (Exception ex) {
            System.err.println("System error");
            return false;
        }
    }
    
    private static boolean masukkanSaldoAwal() {
        System.out.print("Masukkan Saldo Awal : ");
        input = scanner.nextLine();
        return cekParsing(input);
    }
    
    private static boolean masukkanJumlahPenarikan() {
        System.out.print("Jumlah uang yang diambil : ");
        input = scanner.nextLine();
        return cekParsing(input);
    }
    
    private static void tampilSaldoSekarang(String sisaSaldo) {
        System.out.println("Saldo Anda Sekarang : ".concat(sisaSaldo));
    }
    
    public static void main(String[] args) {
        status = false;
        int val;
        String sisaSaldo;
        
        System.out.println("====Program Penarikan Uang====");
        
        while(!status) status = masukkanSaldoAwal();
        tabungan = new Tabungan(Integer.parseInt(input));
        status = false;
        
        while(!status) status = masukkanJumlahPenarikan();
        val = Integer.parseInt(input);
        sisaSaldo = Integer.toString(tabungan.ambilUang(val));
        tampilSaldoSekarang(sisaSaldo);
    }
}
