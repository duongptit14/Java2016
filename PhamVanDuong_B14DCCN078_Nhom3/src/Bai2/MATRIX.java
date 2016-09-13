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
public class MATRIX {
    public static void nhap( int a[][], int n, int m ) {
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i<n; i++ ) {
            a[i] = new int[m+1];
            for( int j = 0; j<m; j++ ) a[i][j] = sc.nextInt(); 
        }
    }
    public static void in( int a[][], int n, int m ) {
        for( int i = 0; i<n; i++ ) {
            for( int j = 0; j<m; j++ ) System.out.print(a[i][j] + " ");
            System.out.println("");
        }
    }
    public static int[][] chuyenVi( int a[][], int n, int m ) {
        int res[][] = new int[m][n];
        for( int i = 0; i<n;i++ ) {
            for( int j = 0; j<m; j++ ) {
                res[j][i] = a[i][j];
            }
        }
        
        return res;
    }
}
