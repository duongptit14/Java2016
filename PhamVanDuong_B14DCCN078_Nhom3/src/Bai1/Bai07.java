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
public class Bai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        if( n %2 == 1 ) {
            for( int i = 1; i<=n; i+=2 ) res += i; 
        }
        else for( int i = 2; i<=n; i+=2 ) res += i;
        System.out.println("Result is " + res);
    }
}
