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
public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100];
        for( int i = 0; i<n; i++ ) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[100];
        for( int i = 0; i<n; i++ ) {
            if( b[i] != -1 ) {
                for( int j = i+1; j<n; j++ ) {
                    if( a[i] == a[j] ) {
                        b[i]++;
                        b[j] = -1;
                    }
                }
            } 
        }
        int Max = 0;
        int maxIndex = 0;
        for( int i = 0; i<n; i++ ) {
            if( b[i] != -1 ) {
                System.out.println(a[i] + " xuat hien " + (b[i] + 1) + " lan");
                if( b[i] > maxIndex ) {
                    maxIndex = b[i];
                    Max = a[i];
                }
            }
        }
        System.out.println("Phan tu xuat hien nhieu lan nhat :" + Max);
    }
}
