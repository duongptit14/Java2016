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
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][4];
        int b[][] = new int [4][5];
        int c[][] = new int [3][5];
        for( int i = 0; i<3; i++ ) {
            for( int j = 0; j<5; j++ ) {
                c[i][j] = 0;
                for( int k = 0; k<4; k++ ) c[i][j] += a[i][k] + b[k][j];
            }
        }
        MATRIX.in(c, 3, 5);
    }
}
