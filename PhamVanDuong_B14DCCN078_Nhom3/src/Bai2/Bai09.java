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
public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int [100];
        for( int i = 0; i<n; i++ ) a[i] = sc.nextInt();
        int x = sc.nextInt();
        int i = 0;
        while( a[i] < x ) {
            i++;
        }
        for( int j = n; j>i; j-- ) {
            a[j] = a[j-1];
        }
        a[i] = x;
        n++;
        for( int j = 0; j<n; j++ ) System.out.print(a[j] + " ");
    }
}
