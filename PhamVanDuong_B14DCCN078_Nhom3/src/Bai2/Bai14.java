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
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int a[][] = new int [n][n];
        MATRIX.nhap(a, n, n);
        int countC = 0;
        int countP = 0;
        for( int i = 0; i<n; i++ ) {
            for( int j = 0; j<n; j++ ) {
                if( i == j ) countC += a[i][j];
                else if( i+j == n+1 ) {
                    countP += a[i][j];
                }
            }
        }
        System.out.println("Tong cheo chinh :" + countC);
        System.out.println("Tong cheo phu :" + countP);
    }
}
