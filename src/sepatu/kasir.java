/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepatu;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class kasir {

    public static void main(String[] args) {
        boolean jalan = true;
        Scanner input = new Scanner(System.in);
        System.out.println("*----JayaBaru----*");
        while (jalan) {
            harga lala = new harga(0, 0, 0, 0, 0, 0,null);           
            System.out.print("Apakah ingin beli lagi?\nya/tidak => ");
            String pilihan = input.next();
            if(pilihan.equalsIgnoreCase("tidak")){
                jalan = false;
            }
        }
    }
}
