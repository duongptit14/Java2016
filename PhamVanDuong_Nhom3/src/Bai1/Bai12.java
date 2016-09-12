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
public class Bai12 {
    public static int process( int n ) {
        int res = 0;
        while( n > 0 ) {
            res += n%10;
            n /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Result is " + process(n));
    }
    
}
