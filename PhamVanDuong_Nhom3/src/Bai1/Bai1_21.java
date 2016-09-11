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
public class Bai1_21 {
    public static boolean isTN( int n ) {
        int dao = 0;
        int k = n;
        while( k > 0 ) {
            dao = dao*10 + k%10;
            k /= 10;
        }
        if( dao == n ) return true;
        return false;
    }
    public static int Count( int n ) {
        int res = 0;
        while( n > 0 ) {
            res += n%10;
            n /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        for( int i = 100000; i<= 999999; i++ ) {
            if( Count(i) == 10 && isTN(i) ) System.out.println(i);
        }
    }
}
