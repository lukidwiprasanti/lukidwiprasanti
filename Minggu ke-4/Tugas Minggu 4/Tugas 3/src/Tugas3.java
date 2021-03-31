/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg3;

import java.util.Scanner;

/**
 *
 * @author ASUSPC
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat Program
        int[] a = {23,69,98,30};
        int max=a[0];
        int min=a[0];
        for (int  i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }
        }
        Scanner scan = new Scanner(System.in);
        int i, b;
        float jum, c, rata;
        System.out.print ("Masukkan banyaknya data nilai = ");
        b = scan.nextInt();
        jum=0;
        i=1;
        while (i<=b){
                System.out.print ("Masukkan data nilai ke-" + i +" = ");
                c=scan.nextFloat ();
                jum += c;
                i++;
        }
        System.out.println("\n");
        System.out.println("Nilai Minimum = "+ min);
        System.out.println("Nilai Maksimum = "+ max);
        rata = jum/b;
        System.out.println ("Nilai rata ratanya adalah = "+ rata);     
   }
}

       
