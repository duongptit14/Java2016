/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;
import java.util.*;
import java.io.*;
/**
 *
 * @author duong
 */
public class Sach implements Serializable {
    private static int constMa = 10000;
    private int ma;
    private String ten;
    private String tacGia;
    private int chuyenNganh;
    private int nam;
    public Sach() {
        this.ma = constMa++;
        this.ten = "";
        this.tacGia = "";
        this.chuyenNganh = 0;
        this.nam = 0;
    }
    public Sach( String ten, String tacGia, int chuyenNganh, int nam ) {
        this.ten = ten;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.nam = nam;
    }
    public void nhap( Scanner sc , boolean inFile ) {
        if(inFile ) {
            this.ten = sc.nextLine();
            this.tacGia = sc.nextLine();
            this.chuyenNganh = Integer.parseInt(sc.nextLine());
            this.nam = Integer.parseInt(sc.nextLine());
        }
        else {
            System.out.println("Nhap ten sach :");
            this.ten = sc.nextLine();
            System.out.println("Nhap tac gia :");
            this.tacGia = sc.nextLine();
            System.out.println("Nhap chuyen nganh :");
            System.out.println("(\t1. Khoa hoc tu nhien\t2. Van hoa - Nghe thuat\t3. Dien tu vien thong"
                    + "\t4.Cong nghe thong tin\t)"
            );
            this.chuyenNganh = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap nam xuat ban :");
            this.nam = Integer.parseInt(sc.nextLine());
        }
    }
    public void in( PrintWriter pw ) {
        pw.write(this.toString());
    }
    public String getStringChuyenNganh( int i ) {
        if( i == 1 ) return "Khoa hoc tu nhien";
        else if( i == 2 ) return "Van hoa - Nghe thuat";
        else if( i == 3 ) return "Dien tu vien thong";
        else return "Cong nghe thong tin";
    }
    public String toString() {
        return this.ma + "\n" + this.ten + "\n" + this.tacGia + "\n"
                + getStringChuyenNganh(this.chuyenNganh) + "\n" + this.nam + "\n";
    }
    public int getMa() { return this.ma;  };
}
