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
public class Bai1_3 {
    public static void draw( int n ) {
        for( int i = 0; i<n; i++ ) {
            for( int j = 0; j<n-i; j++ ) System.out.print(" ");
            for( int j = 0; j< 2*i+1; j++ ) System.out.print("*");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        draw(n);
    }
}
