/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Random;

/**
 *
 * @author phamduong
 */
public class Bai07 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(50)+1;
        int a[] = new int[100];
        for( int i = 0; i<n; i++ ) {
            a[i] = rd.nextInt(100);
        }
        for( int i = 0; i<n; i++ ) {
            System.out.print(a[i] + " ");
        }
        // sort
        for( int i = 0; i<n; i++ ) {
            for( int j = i+1; j<n; j++ ) {
                if( a[i] > a[j] ) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.print("Sau khi sap xep :");
        for( int i = 0; i<n; i++ ) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        // loai bo cac phan tu trung nhau
        for( int i = 0; i<n-1; i++ ) {
            for( int j = i+1; j<n; j++ ) {
//                System.out.println(a[i] + " - " + a[j]);
                if( a[i] == a[j] ) {
                    for( int k = j; k<n; k++ ) {
                        a[k] = a[k+1];
                    }
                    n--;
                }
            }
        }
        System.out.println("mang sau khi loai cac phan tu trung nhau :");
        for( int i = 0; i<n; i++ ) System.out.print(a[i] + " ");
        
    }
}
