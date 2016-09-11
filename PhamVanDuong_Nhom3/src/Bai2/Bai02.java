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
public class Bai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100];
        for(int i = 0; i<n; i++ ) a[i] = sc.nextInt();
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
        for( int i = 0; i<n; i++ ) System.out.print(a[i] + " ");
    }
    
}
