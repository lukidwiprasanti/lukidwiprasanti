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
public class BinarySearch {
    
    int BinarySearch(int arr[], int a, int b, int c ){
        if (b >= 1){
            int mid = 1 + (b-a)/2;
            
            if(arr[mid] == c)
                return mid;
            if(arr[mid] > c)
                return BinarySearch(arr, a, mid-a, c);
            
            return BinarySearch(arr, mid + a ,b ,c);
        }
        return -a;
    }
    public static void main (String[]args){
        BinarySearch bs = new BinarySearch();
        int arr[] = {2, 5, 8, 9, 14, 30}; //Deret angka sudah terurut
        int c = 9; //key yang dicari
        int i = arr.length;
        int result = bs.BinarySearch (arr, 0, i-1, c);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
