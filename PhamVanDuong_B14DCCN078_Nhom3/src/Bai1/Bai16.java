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
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int F0 = 0, F1 = 1;
        System.out.print("0 1 ");
        int Fn;
        for( int i = 1; i<=n-2; i++ ) {
            Fn = F1 + F0;
            System.out.print(Fn + " ");
            F0 = F1;
            F1 = Fn;
        }
        
    }
    
}
