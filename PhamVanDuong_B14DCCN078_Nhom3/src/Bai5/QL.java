/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.*;

/**
 *
 * @author duong
 */
public class QL {
    private BanDoc banDoc;
    private Sach sach;
    private int sl;
    private String tinhTrang;
    public QL() {
        this.banDoc = new BanDoc();
        this.sach = new Sach();
        this.sl = 0;
        this.tinhTrang = "";
    }
    public QL(BanDoc bd , Sach sach, int sl, String tinhTrang ) {
        this.banDoc = bd;
        this.sach = sach;
        this.sl = sl;
        this.tinhTrang = tinhTrang;
    }
    public String toString() {
        return (this.banDoc.toString() + this.sach.toString() + "So luong :" + this.sl +
                "\nTinh trang :" + this.tinhTrang + "\n" );
    }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
