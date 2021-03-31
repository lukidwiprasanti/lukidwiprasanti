/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

/**
 *
 * @author ASUSPC
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Buatlah program untuk menampilan bilangan kelipatan 2 antara 0 -100
        System.out.println("        Do_While        ");
        System.out.println(" Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int angka=1;
        int i;
        do{
            System.out.print(" "+angka);
            angka=angka*2;
        }
        while(angka<=100);
        }
    }


