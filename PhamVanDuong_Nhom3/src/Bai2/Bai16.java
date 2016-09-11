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
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int a[][] = new int [n][n];
        MATRIX.nhap(a, n, n);
        int Max = 0;
        int iMax = 0;
        for( int j = 0; j<n; j++ ) {
            int count = 0;
            for( int i = 0; i<n; i++ ) count += a[i][j];
            if( count > Max ) {
                 Max = count;
                 iMax = j;
            }
        }
        System.out.println("iMax = " + iMax);
        for( int j = iMax; j<n-1; j++ ) {
            for( int i = 0; i<n; i++ ) {
                a[i][j] = a[i][j+1];
            }
        }
        MATRIX.in(a, n, n-1);
    }
}
