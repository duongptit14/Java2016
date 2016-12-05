/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author duong
 */
public class BanDoc implements Serializable {
    private int ma;
    private String ten;
    private String diaChi;
    private String sdt;
    private int loai;
    private static int constMa = 10000;

    public BanDoc() {
        this.ma = BanDoc.constMa++;
        this.ten = "";
        this.diaChi = "";
        this.loai = 0;
        this.sdt = "";
    }

    public BanDoc(String ten, String diaChi, String sdt, int loai) {
        this.ma = BanDoc.constMa++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.loai = loai;
    }

    public String getTen() {
        return ten;
    }

    public int getMa() { return this.ma;  };
    
    public void nhap(Scanner sc, boolean inFile) {
        if (inFile) {
            this.ten = sc.nextLine();
            this.diaChi = sc.nextLine();
            this.sdt = sc.nextLine();
            this.loai = Integer.parseInt(sc.nextLine());
        } else {
            System.out.println("Nhap ten ban doc :");
            this.ten = sc.nextLine();
            System.out.println("Nhap dia chi :");
            this.diaChi = sc.nextLine();
            System.out.println("Nhap sdt :");
            this.sdt = sc.nextLine();
            System.out.println("Nhap loai ");
            System.out.println("(\t1. Sinh vien\t2. Hoc vien Cao hoc\t3. Giang Vien\t) :");
            this.loai = Integer.parseInt(sc.nextLine());
        }
    }
    public void in( PrintWriter pw ) {
        pw.write(this.toString());
    }
    public String getStringLoai( int i ) {
        if( i == 1 ) return "Sinh vien";
        else if( i == 2 ) return "Hoc vien Cao hoc";
        else return "Giang vien";
    }
    @Override
    public String toString() {
        return this.ma + "\n" + this.ten + "\n" + this.diaChi + "\n" + this.sdt
                + "\n" + getStringLoai(this.loai) + "\n";
    }
}
