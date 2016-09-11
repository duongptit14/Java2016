/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.*;
/**
 *
 * @author phamduong
 */
public class Bai20 {
    public static String convert( int n, int b ) {
        StringBuilder str = new StringBuilder("");
        String tmp = "0123456789ABCDEFGHIJKLMNOPQRSTIVWXYZ";
        while( n > 0 ) {
            str.append(tmp.charAt(n%b));
            n /= b;
        }
        str.reverse();
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so va he :");
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("ket qua :" + convert(n,b));
        
    }
}
