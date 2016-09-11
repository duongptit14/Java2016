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
public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n = ");
        int n = sc.nextInt();
        StackOfIntergers st = new StackOfIntergers(1000);
        for( int i = 2; i<=n; i++ ) {
            if( n%i == 0 ) {
                st.push(i);
                n /= i;
                i--;
            }
        }
        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
