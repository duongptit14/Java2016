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
public class SoPhuc {
    private float a;
    private float b;
    public SoPhuc() {
        this.a = 0;
        this.b = 0;
    }
    public SoPhuc(float thuc, float ao ) {
        this.a = thuc;
        this.b = ao;
    }
    public SoPhuc cong( SoPhuc sp2 ) {
        return new SoPhuc(this.a + sp2.a , this.b + sp2.b);
    }
    public SoPhuc tru( SoPhuc sp2 ) {
        return new SoPhuc(this.a - sp2.a , this.b - sp2.b);
    }
    public SoPhuc nhan( SoPhuc sp2 ) {
        return new SoPhuc(this.a*sp2.a - this.b*sp2.b , this.a*sp2.b + this.b*sp2.a);
    }
    public SoPhuc chia( SoPhuc sp2 ) {
        float modul = this.modul();
        SoPhuc z_ = new SoPhuc(this.a, -this.b);
        return new SoPhuc(sp2.nhan(z_).a / modul , sp2.nhan(z_).b / modul);
    }
    public boolean bangNhau(SoPhuc sp2 ) {
        return this.a == sp2.a && this.b == sp2.b;
    }
    public boolean lonHon(SoPhuc sp2 ) {
        return this.modul() > sp2.modul();
    }
    public boolean nhoHon(SoPhuc sp2 ) {
        return this.modul() < sp2.modul();
    }
    public SoPhuc nghichDao() {
        return new SoPhuc(this.b, this.a);
    }
    public float modul() {
        return this.a*this.a + this.b*this.b;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan thuc :");
        this.a = sc.nextFloat();
        System.out.println("Nhap phan ao :");
        this.b = sc.nextFloat();
    }
    public void hien() {
        System.out.println(this.a + " + " + this.b + "i");
    }
}
