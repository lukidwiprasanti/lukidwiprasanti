/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statement_do_while;

/**
 *
 * @author ASUSPC
 */
public class Statement_do_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variable
        int i=0;
        do{
            System.out.println("Perulangan ke-" +i);
            i++;
        }
        while (i<=10);
    }
    
}
