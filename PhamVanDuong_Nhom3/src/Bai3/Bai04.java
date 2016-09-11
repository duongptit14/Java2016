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
public class Bai04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n = ");
        int n = sc.nextInt();
        int [] tmp = new int[1000];
        StackOfIntergers st = new StackOfIntergers(1000);
        for( int i = 2; i<n; i++ ) {
            if( tmp[i] == 0 ) {
                st.push(i);
                for( int j = 2; i*j <n; j++ ) {
                    tmp[i*j] = 1;
                }
            }
        }
        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
