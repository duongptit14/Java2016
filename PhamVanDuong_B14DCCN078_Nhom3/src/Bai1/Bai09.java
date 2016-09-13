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
public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for( int i = 2; i<= Math.sqrt(n); i++ ) {
            if( n %i == 0 ) {
                if( n/i == i ) System.out.print(i + " ");
                else System.out.print( i + " " + n/i + " ");
            } 
            
        }
    }
    
}
