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
public class Bai1_24 {
    public static boolean isPrimary( long n ) {
        if( n == 2 || n == 3 ) return true;
        if( n%6 != 1 && n%6 != 5 || n == 1 ) return false;
        double sa = (double)Math.sqrt(n);
        for( long i = 5; i<= sa; i+=6 ) {
            if( n % i == 0 || n % (i+2) == 0 ) return false;
        }
        return true;
    }
    public static boolean phantach( long n ) {
        while( n > 0 ) {
            int tmp = (int)n%10;
            if( !isPrimary(tmp) ) return false;
            n /= 10;
        }
        return true;
    }
    public static long reverse( long n ) {
        long dao = 0;
        long k = n;
        while( k > 0 ) {
            dao = dao*10 + k%10;
            k /= 10;
        }
        return dao;
    }
    public static void main(String[] args) {
        for( int i = 1000000; i<= 9999999; i++ ) {
            if( phantach(i) && isPrimary(reverse(i)) && isPrimary(i) ) System.out.println(i);
        }
    }
}
