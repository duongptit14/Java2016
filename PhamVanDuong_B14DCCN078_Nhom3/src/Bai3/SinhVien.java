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
public class SinhVien {
    private String ten;
    private String maSV;
    private String lop;
    private int khoa;

    public SinhVien(String ten, String maSV, String lop, int khoa) {
        this.ten = ten;
        this.maSV = maSV;
        this.lop = lop;
        this.khoa = khoa;
    }
    public SinhVien() {
        this.ten = "";
        this.lop = "";
        this.maSV = "";
        this.khoa = 0;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }
    
    //
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten :");
        this.ten = sc.nextLine();
        System.out.println("Nhap lop :");
        this.lop = sc.nextLine();
        System.out.println("Nhap khoa :");
        this.khoa = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ma sinh vien :");
        this.maSV = sc.nextLine();
    }
    public void in() {
        System.out.printf("Ten: %s - Lop: %s - Khoa: %d - MaSV: %s ", this.ten, this.lop, this.khoa , this.maSV);
        System.out.println("");
    }
    
    
    
    
    //
    
    
    
}
