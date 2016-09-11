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
public class Bai1_11 {
    public static int GCD( int a, int b ) {
        while( b > 0 ) {
            int c = a%b;
            a = b;
            b = c;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b;
        a = sc.nextInt();
        b = sc.nextInt();
        for( int i = a; i<b; i++ ) {
            for( int j = i+1; j<=b; j++ ) {
                if(GCD( i, j) == 1 ) System.out.println(i + " " + j );
            }
        }
    }
    
}
