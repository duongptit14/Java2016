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
public class Bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int a[] = new int[100];
        int b[] = new int[100];
        n = sc.nextInt();
        for( int i = 0;i<n; i++ ) a[i] = sc.nextInt();
        m = sc.nextInt();
        for( int i = 0; i<m; i++ ) b[i] = sc.nextInt();
        int p = sc.nextInt();
        int res[] = new int[1000];
        for( int i = 0; i<p; i++ ) {
            res[i] = a[i];
            System.out.print(res[i] + " ");
        }
        for( int i = p; i<p+m; i++ ) {
            res[i] = b[i-p];
            System.out.print(res[i] + " ");
        }
        for( int i = p+m; i< m+n; i++ ) {
            res[i] = a[i-m];
            System.out.print(res[i] + " ");
        }
    }
}
