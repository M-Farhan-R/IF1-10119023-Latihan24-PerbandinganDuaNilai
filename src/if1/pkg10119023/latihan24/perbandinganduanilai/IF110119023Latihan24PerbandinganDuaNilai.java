/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan24.perbandinganduanilai;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner;
public class IF110119023Latihan24PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    int nilai1,nilai2;
    
    public void input(){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = scan1.nextInt();
        System.out.print("Masukkan nilai kedua   : ");
        nilai2 = scan2.nextInt();
    }
    
    public void banding(){
        if (nilai1>nilai2){
            System.out.println(nilai1+" Lebih besar dari "+nilai2);
        } else if(nilai2>nilai1){
            System.out.println(nilai1+" Lebih kecil dari "+nilai2);
        } else {
            System.out.println(nilai1+" Sama dengan "+nilai2);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("=======Program Perbandingan Nilai=======");
        IF110119023Latihan24PerbandinganDuaNilai kelas = new IF110119023Latihan24PerbandinganDuaNilai();
        boolean ulang = true;
        while(ulang){
            kelas.input();
            kelas.banding();
            System.out.println("");
            System.out.print("Ulangi Aktifasi? (Ya/Tidak) : ");
            String loop = scan1.next();
            if (loop.equalsIgnoreCase("tidak")){
                ulang = false;
            }
        }
    }

}
