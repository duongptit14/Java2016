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
public class Bai23 {
    public static String add(String s1, String s2 ) {
        int len = s1.length();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        sb1.reverse(); sb2.reverse();
        while( sb2.length() < sb1.length()) sb2.append('0');
        System.out.println(sb1 + " - " + sb2);
        int carry = 0;
        int tmp = 0;
        StringBuilder res = new StringBuilder("");
        for( int i = 0; i< sb1.length(); i++ ) {
            tmp = Integer.parseInt(sb1.charAt(i) + "") + Integer.parseInt(sb2.charAt(i) + "") + carry;
//            System.out.println("tmp = " + tmp);
            carry = tmp / 10;
            res.append(tmp%10);
//            System.out.println("res = " + res);
        }
        if( carry != 0 ) res.append(carry);
        
        res.reverse();
        return res.toString();
    }
    public static String tru( String s1, String s2 ) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        sb1.reverse();
        sb2.reverse();
        while( sb2.length() < sb1.length() ) sb2.append('0');
        
        int carry = 0;
        int tmp;
        StringBuilder res = new StringBuilder("");
        for( int i = 0; i< sb1.length(); i++ ) {
            
            if( Integer.parseInt(sb1.charAt(i) + "")  >= Integer.parseInt(sb2.charAt(i) + "") + carry) {
                res.append((Integer.parseInt(sb1.charAt(i) + "") - carry - Integer.parseInt(sb2.charAt(i) + "")) % 10 );
//                carry = (carry + Integer.parseInt(sb1.charAt(i) + "") - Integer.parseInt(sb2.charAt(i) + "") ) / 10;
                carry = 0;
                
            }
            else {
                res.append((Integer.parseInt(sb1.charAt(i) + "") - carry + 10 - Integer.parseInt(sb2.charAt(i) + "")) % 10 );
                carry = 1;
                
            }
        }
        if( res.charAt(res.length() - 1) == '0' ) res.deleteCharAt(res.length() - 1);
        res.reverse();
        return res.toString();
    }
    public static String tich(String a, String b) {
        StringBuilder A = new StringBuilder(a);
        StringBuilder B = new StringBuilder(b);
        A.reverse();
        B.reverse();
        StringBuilder res = new StringBuilder("");
        int nho = 0;
        for (int i = 0; i < A.length() + B.length(); i++) {
            int s = 0;
            for (int j = 0; j <= i; j++) {
                if (j < A.length() && (i - j) < B.length()) {
                    s += (A.charAt(j) - '0') * (B.charAt(i - j) - '0');
                }
            }
            s += nho;
            nho = s / 10;
            res.append((char)(s % 10 + '0'));
        }
        if (nho > 0) {
            res.append((char)(nho + '0'));
        }
        while(res.length() > 1 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if( s1.compareTo(s2) >= 1 ) System.out.println(tru(s1, s2));
        else System.out.println("-" + tru(s2, s1));
    }
}
