/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

import java.util.Scanner;

public class UKL {

    public static void main(String[] args) 
    {
        UKL show = new UKL();
        show.Spp();
    }

    public void Spp() {
        String pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("Harga DSP dan SPP");
        System.out.println("Pilih Jalur Masuk");
        System.out.println("1. SBMPTN");
        System.out.println("2. SNMPTN");
        System.out.println("3. Mandiri");
        pilihan = input.next();

        switch (pilihan) {
            case "1", "SBMPTN", "sbmptn":
                System.out.println("Pilih Gologan Pendapatan");
                System.out.println("A, B, C");
                pilihan = input.next();
                if (pilihan.equalsIgnoreCase("A")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 5,000,000.00");
                    System.out.println("SPP - Rp 500,000.00");
                }
                else if (pilihan.equalsIgnoreCase("B")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 15,000,000.00");
                    System.out.println("SPP - Rp 1,000,000.00");
                }
                else if (pilihan.equalsIgnoreCase("C")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 30,000,000.00");
                    System.out.println("SPP - Rp 2,000,000.00");
                }break;
            case "2", "SNMPTN", "snmptn":
                System.out.println("Pilih Gologan Pendapatan");
                System.out.println("A, B, C");
                pilihan = input.next();
                if (pilihan.equalsIgnoreCase("A")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 7,000,000.00");
                    System.out.println("SPP - Rp 500,000.00");
                }
                else if (pilihan.equalsIgnoreCase("B")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 17,000,000.00");
                    System.out.println("SPP - Rp 1,000,000.00");
                }
                else if (pilihan.equalsIgnoreCase("C")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 35,000,000.00");
                    System.out.println("SPP - Rp 2,000,000.00");
                }break;
            case "3", "MANDIRI", "mandiri":
                System.out.println("Pilih Gologan Pendapatan");
                System.out.println("A, B, C");
                pilihan = input.next();
                if (pilihan.equalsIgnoreCase("A")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 10,000,000.00");
                    System.out.println("SPP - Rp 1,000,000.00");
                }
                else if (pilihan.equalsIgnoreCase("B")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 25,000,000.00");
                    System.out.println("SPP - Rp 2,000,000.00");
                }
                else if (pilihan.equalsIgnoreCase("C")) {
                    System.out.println("Harga DSP dan SPP");
                    System.out.println("DSP - Rp 50,000,000.00");
                    System.out.println("SPP - Rp 3,000,000.00");
                }break;
        }

    }

}
