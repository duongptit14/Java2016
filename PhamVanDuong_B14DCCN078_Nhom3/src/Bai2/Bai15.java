/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.*;
/**
 *
 * @author phamduong
 */
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int a[][] = new int [n][n];
        MATRIX.nhap(a, n, n);
        int Min = 9999;
        int iMin = 0;
        for( int i = 0; i<n; i++ ) {
            int count = 0;
            for( int j = 0; j<n; j++ ) count += a[i][j];
            if( count < Min ) {
                 Min = count;
                 iMin = i;
            }
        }
        System.out.println("iMin = " + iMin);
        for( int i = iMin; i<n-1; i++ ) {
            for( int j = 0; j<n; j++ ) {
                a[i][j] = a[i+1][j];
            }
        }
        MATRIX.in(a, n-1, n);
    }
}
