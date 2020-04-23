/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

/**
 * Michael Jonathan Setiawan
 * 58170468
 */

import java.util.Scanner;
public class PernyataanDOWHILE3 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int pilihan;
        
        do {
            System.out.println("Pilihlah menu di bawah ini: ");
            System.out.println("1. Cetak");
            System.out.println("2. Lihat");
            System.out.println("3. Keluar");
            
            System.out.print("Pilihan anda: ");
            pilihan = input.nextInt();
            
            if (pilihan == 1) {
                System.out.println("nCetak laporan, siapkan printer");
            } else if (pilihan == 2) {
                System.out.println("nTampilkan laporan");
            }
        } while (pilihan != 3);
    }
}
