/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;

/**
 *
 * @author ASUSPC
 */
public class TUGAS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program untuk menampilkan bilangan genap dari kecil ke besar menggunakan for
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Angka Maksimal = ");
        a=scan.nextInt();
        
        for(int i=2; i<=a; i+=2){
            System.out.print(i+" ");
        }
    }
    
}
