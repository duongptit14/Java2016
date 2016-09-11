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
public class Bai1_23 {

    public static boolean isTN(long n) {
        long dao = 0;
        long k = n;
        while (k > 0) {
            dao = dao * 10 + k % 10;
            k /= 10;
        }
        if (n == dao) {
            return true;
        }
        return false;
    }

    public static int tong(long n) {
        int res = 0;
        while (n > 0) {
//            if( n%10 != 0 && n%10 != 6 && n%10 != 8 ) return -1;
            res += n % 10;
            n /= 10;
        }
        return res;
    }
    public static boolean isRight( long n ) {
        while(n>0) {
            int tmp = (int)n%10;
            if( tmp != 0 && tmp != 6 && tmp != 8 ) return false;
            n /= 10;
        }
        return true;
        
    }

    public static void main(String[] args) {
        for( long i = 1000000; i<= 999999999; i++ ) {
//            System.out.println(i );
            if( tong(i) == 10 && isRight(i) && isTN(i)   ) System.out.println(i);
        }
        
    }
}
