/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author phamduong
 */
public class Bai1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("Nhap x = ");
            x = sc.nextInt();
        } while( x <= 10 || x >= 99 );
        Random rd = new Random();
        int count = 0;
        while(true) {
            count++;
            int tmp = rd.nextInt(88) + 11;
            System.out.println("buoc " + count + " :" + tmp);
            if( tmp == x ) break;
        }
        System.out.println("So buoc : " + count);
    }
    
}
