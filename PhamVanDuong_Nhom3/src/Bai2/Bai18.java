/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author phamduong
 */
public class Bai18 {
    public static void Sort( int a[], int n ) {
        for( int i = 0; i<n-1; i++) {
            for( int j = i+1; j<n; j++) {
                if(a[i] > a[j] ) {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int a[][] = new int [n][n];
        MATRIX.nhap(a, n, n);
        int b[] = new int[n*n+1];
        int count = 0;
        for( int i = 0; i<n; i++ ) {
            for( int j = 0; j<n; j++ ) {
                b[count] = a[i][j];
                count++;
            }
        }
//        for( int i = 0; i<n*n; i++ ) System.out.println(b[i] + " ");
        Sort(b,n*n);
//        for( int i = 0; i<n*n; i++ ) System.out.println(b[i] + " ");
        count = 0;
        for( int i = 0; i<n; i++ ) {
            for( int j = 0; j<n; j++ ) {
                System.out.println(b[count] + " ");
                count++;
            }
            System.out.println("");
        }
        
    }
}
