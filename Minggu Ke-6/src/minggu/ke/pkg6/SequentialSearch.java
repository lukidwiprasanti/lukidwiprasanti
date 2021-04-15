/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.ke.pkg6;

/**
 *
 * @author ASUSPC
 */
public class SequentialSearch {
    public static void main(String[] args) {
       
        int[]Data = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int Key = 4;
        SequentialSearch(Data, Key);
    }
    public static void SequentialSearch(int[] parameterDataSatu, int parameterDataDua){
        int index=-1;
        for (int i=0; i<parameterDataSatu.length; i++){
            if (parameterDataSatu[i] == parameterDataDua){
                
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Your target integer does not exit in the array");
        }else{
            System.out.println("Your target integer is in index " + index + " of the array");
        }
     }
}
    

