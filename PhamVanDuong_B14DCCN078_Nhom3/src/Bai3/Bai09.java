/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.*;

/**
 *
 * @author phamduong
 */
public class Bai09 {

    public static void convert(int n, int b) {
        StackOfChars st = new StackOfChars(1000);
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (n > 0) {
            int c = n % b;
            st.push(str.charAt(c));
            n /= b;
        }

        while(!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so va he");
        int n = sc.nextInt();
        int b = sc.nextInt();
        convert(n,b);
    }
}
