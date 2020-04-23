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
public class PernyataanDOWHILE2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        
        int m;
        float n, jumlah, x, rata;
        
        System.out.print("Banyaknya data: ");
        n = input.nextFloat();
        jumlah = 0;
        m = 1;
        
        do {
            System.out.print("Data ke-" + m + ": ");
            x = input.nextFloat();
            jumlah += x;
            m++;
        } while (m <= n);
        {
            System.out.print("Rata-rata     : " + jumlah / n);
        }
    }
}
