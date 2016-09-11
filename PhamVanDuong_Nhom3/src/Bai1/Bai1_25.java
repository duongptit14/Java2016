/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author phamduong
 */
public class Bai1_25 {
    public static int kCn( int k, int n ) {
        if( k == 0 || k == n ) return 1;
        return (kCn(k, n-1) + kCn(k-1,n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i<n; i++ ) {
            for( int j = 0; j<=i; j++ ) {
                System.out.print(kCn(j,i));
            }
            System.out.println("");
        }
    }
}
