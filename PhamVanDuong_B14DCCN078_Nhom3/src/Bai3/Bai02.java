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
public class Bai02 {

    public static void nhapDS(SinhVien ds[], int n) {
        for (int i = 0; i < n; i++) {
            ds[i] = new SinhVien();
            ds[i].nhap();
        }
    }

    public static void inDS(SinhVien ds[], int n) {
        System.out.println("Thong tin cac sinh vien :");
        for (int i = 0; i < n; i++) {
            ds[i].in();
        }
    }

    public static void sortName(SinhVien ds[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].getTen().compareToIgnoreCase(ds[j].getTen()) > 0) {
                    SinhVien tmp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tmp;
                }
            }
        }
    }

    public static void inTheoLop(SinhVien ds[], int n) {
        int[] tmp = new int[1000];
//        for( int i = 0; i<n; i++ ) {
//            System.out.println("a[" + "] = " + tmp[i]);
//        }
        for (int i = 0; i < n; i++) {
            if (tmp[i] == 0) {
                System.out.println("Danh sach sinh vien lop :" + ds[i].getLop() + ": ");
                for (int j = i; j < n; j++) {
                    if (ds[j].getLop().equals(ds[i].getLop()) && tmp[j] == 0) {
                        ds[j].in();
                        tmp[j] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien :");
        int n = sc.nextInt();
        SinhVien[] ds = new SinhVien[1000];
        nhapDS(ds, n);
        inDS(ds, n);
        System.out.println("Danh sach sinh vien sau khi sap xep :");
        sortName(ds, n);
        inDS(ds, n);
        inTheoLop(ds, n);
    }
}
