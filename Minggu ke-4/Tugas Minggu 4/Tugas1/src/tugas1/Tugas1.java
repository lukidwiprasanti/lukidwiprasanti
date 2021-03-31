/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
        // Program untuk menampilkan bilangan genap dari kecil ke besar menggunakan perulangan for
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Angka Maksimal = ");
        a=scan.nextInt();
        
        for(int i=1; i<=a; i+=2){
            System.out.print(i+" ");
        }
    }
    
}
