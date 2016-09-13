/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
//import java.util.*;

import java.util.Scanner;

/**
 *
 * @author phamduong
 */
public class Bai21 {
    public static boolean isTN( int n ) {
        String str = new String(""+n);
        int left = 0; int right = str.length()-1;
        while( left < right ) {
            if( str.charAt(left) != str.charAt(right) ) return false;
            left++; right--;
        }
        return true;
    }
    public static void main(String[] args) {
        for( int i = 100000; i<=999999; i++ ) {
            if( isTN(i)) System.out.println(i);
        }
    }
}
