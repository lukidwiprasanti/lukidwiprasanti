/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statement_for;

/**
 *
 * @author ASUSPC
 */
public class Statement_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Statemen For
        for (int i=0; i<=5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
