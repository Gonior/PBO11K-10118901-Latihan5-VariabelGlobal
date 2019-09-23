/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan5.variabelglobal;

/**
 *
 * @author 
 * NAMA         : Dedi Cahya
 * KELAS        : IF-11-K
 * NIM          : 10118901
 * DESKRIPSI    : kambing global
 */
public class PBO11K10118901Latihan5VariabelGlobal {

    //variabel jumlah kambing menjadi variabel instance
    int jumlahKambing = 88;
    
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing : "+jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah :"+jumlahKambing);
    }
    public static void main(String[] args) {
        PBO11K10118901Latihan5VariabelGlobal kambingSusu = new PBO11K10118901Latihan5VariabelGlobal();
        
        //menampilkan jumlah kambinf yang ada saat program pertam dijalankan
        kambingSusu.getJumlahKambing();
        
        //menambah 5 kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
