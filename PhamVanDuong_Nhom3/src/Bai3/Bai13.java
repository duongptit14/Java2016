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
public class Bai13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        p1.nhap();
        p2.nhap();
        System.out.print("p1 + p2 = ");
        p1.cong(p2).hien();
        System.out.println("");
        System.out.print("p1 - p2 = ");
        p1.tru(p2).hien();
        System.out.println("");
        System.out.print("p1 * p2 = ");
        p1.nhan(p2).hien();
        System.out.println("");
        System.out.print("p1 / p2 = ");
        p1.chia(p2).hien();
        System.out.println("");
        System.out.print("p1 toi gian :");
        p1.toiGian().hien();
        if( p1.bangNhau(p2) ) System.out.println("p1 = p2");
        else if( p1.lonHon(p2)) System.out.println("p1 > p2");
        else if( p1.nhoHon(p2)) System.out.println("p1 < p2");
    }
}
