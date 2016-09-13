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
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoPhuc sp1 = new SoPhuc();
        SoPhuc sp2 = new SoPhuc();
        sp1.nhap();
        sp2.nhap();
        System.out.print("sp1 + sp2 = ");
        sp1.cong(sp2).hien();
        System.out.println("");
        System.out.print("sp1 - sp2 = ");
        sp1.tru(sp2).hien();
        System.out.println("");
        System.out.print("sp1 * sp2 = ");
        sp1.nhan(sp2).hien();
        System.out.println("");
        System.out.print("sp1 / sp2 = ");
        sp1.chia(sp2).hien();
        System.out.println("");
        System.out.print("sp1 nghich dao :");
        sp1.nghichDao().hien();
        System.out.println("");
        if( sp1.bangNhau(sp2)) System.out.println("sp1 = sp2 ");
        else if( sp1.lonHon(sp2)) System.out.println("sp1 lon hon sp2");
        else System.out.println("sp1 nho hon sp2");
    }
}
