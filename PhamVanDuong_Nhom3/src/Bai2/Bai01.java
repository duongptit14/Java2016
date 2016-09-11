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
public class Bai01 {
    public static boolean isTN( int a[], int n) {
        int left = 0;
        int right = n-1;
        while( left <= right ) {
            if( a[left] != a[right] ) return false;
            left++; right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        for( int i = 0; i<n; i++ ) {
            a[i] = sc.nextInt();
        }
        System.out.println(isTN(a,n));
    }
}
