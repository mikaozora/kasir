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
public class harga extends sepatu{
  
    public int jumlah;
    Scanner lama = new Scanner(System.in);
    public harga(int size, int kategori, int jenis, int warna, int merk, int jumlah,String nama){
        super.sepatu(jenis,kategori,warna,merk,size,nama);
        System.out.print("Berapa jumlah yang anda inginkan => ");
        this.jumlah = jumlah = lama.nextInt();
        if(this.jumlah == 2){
            super.hasildiskon();
            
        }else if(this.jumlah == 3){
            super.hasildiskon3();
        }else{
            super.hasil();
        }
    }


    
}
