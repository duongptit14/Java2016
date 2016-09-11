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
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100];
        int b[] = new int[100];
        int Max = 0;
        int index = 0;
        b[0] = 1;
        for( int i = 0; i<n; i++ ) {
            a[i] = sc.nextInt();
        }
        for( int i = 1; i<n; i++ ) {
        if( a[i] >= a[i-1]) b[i] = b[i-1] + 1;
            else b[i] = 1;
            if( b[i] > Max ) {
                Max = b[i];
                index = i - b[i]+1;
            }
    }
        System.out.println(Max + " " + index);
    }
}
