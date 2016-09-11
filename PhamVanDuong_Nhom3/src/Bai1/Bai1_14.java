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
public class Bai1_14 {
    public static boolean isNT( int n ) {
        for( int i = 2; i<=Math.sqrt(n); i++ ) {
            if( n%i == 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 2; i<n; i++ ) {
            if( isNT(i) ) System.out.print(i + " ");
        }
    }
    
}
