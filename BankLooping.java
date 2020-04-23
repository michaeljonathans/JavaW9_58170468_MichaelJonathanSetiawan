/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

/**
 * Michael Jonathan Setiawan 58170468
 */
import java.util.Scanner;

public class BankLooping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih, saldoawal = 100000;
        int ceksaldo, setoruang = 0, tarikuang;

        do {
            System.out.println("Menu ATM");
            System.out.println("1. Cek saldo");
            System.out.println("2. Setor uang");
            System.out.println("3. Tarik uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu        : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    ceksaldo = saldoawal;
                    System.out.println("Saldo anda        : " + ceksaldo);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Jumlah uang anda yang akan disetor: ");
                    setoruang = input.nextInt();

                    saldoawal = saldoawal + setoruang;
                    System.out.println("Saldo anda        : " + saldoawal);
                    
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Tarik uang sebesar        : ");
                    tarikuang = input.nextInt();

                    if (saldoawal < tarikuang) {
                        System.out.println("Maaf, saldo anda tidak mencukupi");
                    }
                    saldoawal = saldoawal - tarikuang;
                    System.out.println("Sisa saldo anda        : " + saldoawal);
                    
                    System.out.println("");
                    break;
            }
        } while (pilih != 4);
    }
}
