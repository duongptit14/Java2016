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
public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau :");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        StringTokenizer stk = new StringTokenizer(str);
        while( stk.hasMoreTokens()) {
            String tmp = stk.nextToken();
            sb.append(Character.toUpperCase(tmp.charAt(0)));
            for( int i = 1; i< tmp.length(); i++ ) sb.append(Character.toLowerCase(tmp.charAt(i)));
            sb.append(" ");
        }
        System.out.println("result :" + sb);
    }
}
