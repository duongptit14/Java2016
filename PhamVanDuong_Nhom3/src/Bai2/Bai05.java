/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author phamduong
 */
public class Bai05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int b[] = new int[100];
        int res = 0;
        int Min = 9999;
        for (int i = 0; i < n; i++) {
            b[i] = a[i] - x;
            if (b[i] < 0) {
                b[i] = -b[i];
            }
            if (b[i] < Min) {
                Min = b[i];
                res = a[i];
            }
        }
        System.out.println("Result is " + res);
    }
}
