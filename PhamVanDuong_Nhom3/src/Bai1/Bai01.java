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
public class Bai01 {
    public static void draw( int w, int h ) {
        for( int i = 0; i<h; i++ ) {
            for( int j = 0; j<w; j++ ) System.out.print("*");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h;
        w = sc.nextInt();
        h = sc.nextInt();
        draw(w,h);
    }
}
