/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author phamduong
 */
public class Bai22 {
    public static boolean isNT( int n ) {
        for( int i = 2; i<= Math.sqrt(n); i++ ) {
            if( n%i == 0 ) return false;
        }
        return true;
    }
    public static boolean check( int n ) {
        while( n > 0 ) {
            int tmp = n%10;
            if( n %2 == 0 ) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        for( int i = 100000; i<= 999999; i++ ) {
            if( check(i) && isNT(i) ) System.out.println(i);
        }
    }
}
