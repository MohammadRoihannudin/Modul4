/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author surip8
 */
class bubblesort {
    public static void B_bubblesort(int[] A){
        int i =1, j, n = A.length;
        int temp;
        while (i<n) {            
            j=n-1;
            while(j>=i){
                if(A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j -= 1;
            }
            i += 1;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] a = {25,7,9,13,3};
        bubblesort.tampil(a);
        bubblesort.B_bubblesort(a);
        bubblesort.tampil(a);
        
        
        System.out.println();
        System.out.println("Mohammad Roihannudin");
    }
} 

