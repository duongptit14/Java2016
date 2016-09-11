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
public class Bai1_17 {
    public static boolean isTN( int n ) {
        int dao = 0;
        int k = n;
        while(k > 0 ) {
            dao = dao*10 + k%10;
            k /= 10;
        }
        if( n == dao ) return true;
        return false;
    }
    public static void main(String[] args) {
        for( int i = 100000; i<= 999999; i++ ) {
            if( isTN(i) ) System.out.println(i);
        }
    }
    
}
