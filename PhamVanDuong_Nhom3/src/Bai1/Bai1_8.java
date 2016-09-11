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
public class Bai1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float res = 0;
        for( int i = 1; i<=n; i++ ) {
            res += (float)1 / i;
        }
        System.out.println("Result is " + res);
    }
    
}
