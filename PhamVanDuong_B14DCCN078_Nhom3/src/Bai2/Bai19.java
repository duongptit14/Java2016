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
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        int [][] b = new int[n][n];
        MATRIX.nhap(a, n, n);
        int tmp = n;
        for( int i = 0; i<n; i++ ) {
            for( int j = 0; j<n; j++ ) {
                b[i][j] = a[j][tmp-1];
            }
            tmp--;
        }
        System.out.println("Sau khi xoay 90 do :");
        MATRIX.in(b, n, n);
    }
}
