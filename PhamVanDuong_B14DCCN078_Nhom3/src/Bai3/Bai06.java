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
public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = sc.nextInt();
        StackOfIntergers st = new StackOfIntergers(1000); 
        while(n > 0) {
            st.push(n%2);
            n /= 2;
        }
        while(!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
}
