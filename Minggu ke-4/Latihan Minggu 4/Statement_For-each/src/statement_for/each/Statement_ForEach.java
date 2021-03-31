/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statement_for.each;

/**
 *
 * @author ASUSPC
 */
public class Statement_ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] angka = {3,1,42,24,12};

        // Menggunkan perulangan For each untuk mrnampilkan angka
        for (int x : angka){
            System.out.print(x +" ");
        }
    }
    
}
