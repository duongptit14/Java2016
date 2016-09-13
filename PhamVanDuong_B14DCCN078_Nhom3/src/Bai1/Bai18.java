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
public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int a = (int)Math.sqrt(m);
        int b = (int)Math.sqrt(n);
        for( int i = a; i<=b; i++ ) {
            if( i*i >= m && i*i <= n ) System.out.println(i*i);
        }
    }
    
}
