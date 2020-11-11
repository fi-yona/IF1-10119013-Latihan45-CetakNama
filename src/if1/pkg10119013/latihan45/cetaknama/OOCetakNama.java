/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan45.cetaknama;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;

public class OOCetakNama {
    
    Scanner scan = new Scanner(System.in);
    
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil cetak : ");
        for (int i = 1; i <= jmlCetak; i++){
            System.out.println(i + ". " + nama);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====APLIKASI PENCETAK NAMA=====");
        OOCetakNama oo = new OOCetakNama();
        String nama = oo.nama;
        int jmlCetak = oo.jmlCetak;
        System.out.print("Masukkan nama anda : ");
        oo.setNama(scan.nextLine());
        System.out.print("Mau cetak nama anda berapa kali? : ");
        oo.setJmlCetak (scan.nextInt());
        oo.cetak(oo.getNama());
        oo.cetak(oo.getJmlCetak(),oo.getNama());
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
