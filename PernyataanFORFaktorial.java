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
public class PernyataanFORFaktorial {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int angka, i, faktorial = 1;
        
        System.out.println("   Mencari Faktorial dari Angka   ");
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        
        for (i = 1; i <= angka; i++) {
            faktorial = faktorial * i;
        }
        
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
    }
}
