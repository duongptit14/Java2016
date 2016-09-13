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
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int [n][n];
        int i, b = 0, d = 1;
        while (b <= n / 2) {
            for (i = b; i < n - b; i++) {
                a[b][i] = d++;
            }
            for (i = b + 1; i < n - b - 1; i++) {
                a[i][n - b - 1] = d++;
            }
            for (i = n - b - 1; i > b; i--) {
                a[n - b - 1][i] = d++;
            }
            for (i = n - b - 1; i > b; i--) {
                a[i][b] = d++;
            }
            b++;
        }
        for( int k = 0; k<n; k++ ) {
            for( int j = 0; j<n; j++ ) System.out.printf("%4d\t", a[k][j]);
            System.out.println("");
        }
    }
}
