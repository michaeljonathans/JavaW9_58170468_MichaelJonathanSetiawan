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
public class PernyataanFORNilaiRataRata {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nama;
        int jumlahmk, i, nilai[], jumlahnilai = 0;
        nilai = new int[100];
        float ratarata;
        
        System.out.println("   Mencari Nilai Rata-Rata   ");
        System.out.print("Nama Mahasiswa        : ");
        nama = input.nextLine();
        System.out.print("Jumlah Mata Kuliah    : ");
        jumlahmk = input.nextInt();
        
        for (i = 1; i <= jumlahmk; i++) {
            System.out.print("Nilai MK ke-" + i + " adalah  : ");
            nilai[i] = input.nextInt();
            
            jumlahnilai = jumlahnilai + nilai[i];
        }
        ratarata = jumlahnilai / jumlahmk;
        System.out.println("Rata-rata " + ratarata);
    }
}
