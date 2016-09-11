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
public class Bai06 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(20)+1;
        int a[] = new int[100];
        for( int i = 0; i<n; i++ ) {
            a[i] = rd.nextInt(100);
        }
        for( int i = 0; i<n; i++ ) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        int b[] = new int[100];
        for( int i = 0;i<n; i++ ) {
            if( b[i] != -1 ) {
                for( int j = i+1; j<n; j++ ) {
                    if( a[i] == a[j]) {
                        b[j] = -1;
                    }
                }
            }
        }
        for( int i = 0; i<n; i++ ) {
            if( b[i] != -1 ) System.out.print(a[i] + " ");
        }
    }
}
