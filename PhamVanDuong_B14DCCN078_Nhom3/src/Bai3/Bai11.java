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
public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPoint[] ds = new MyPoint[4];
        for (int i = 0; i < 3; i++) {
            ds[i] = new MyPoint();
            ds[i].nhap();
        }
        double a = MyPoint.distance(ds[0], ds[1]);
        double b = MyPoint.distance(ds[1], ds[2]);
        double c = MyPoint.distance(ds[2], ds[0]);
        if( a+b <= c || a+c <= b || b+c <= a ) {
            System.out.println("Khong tao thanh tam giac");
        }
        else {
            System.out.print("Tao tam giac");
            if( (int)(a*a) == (int)(b*b + c*c) || (int)(b*b) == (int)(a*a+c*c) || (int)(c*c) == (int)(a*a + b*b) ) {
                System.out.print(" vuong");
            }
            if(a ==b && b == c ) System.out.println(" deu");
            else if( a == b || b == c || a == c ) System.out.print(" can");
            
        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(ds[i].toString());
//        }
        

    }
}
