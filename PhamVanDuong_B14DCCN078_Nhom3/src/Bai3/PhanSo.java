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
public class PhanSo {
    private int ts;
    private int ms;
    public PhanSo() {
        this.ts = 0;
        this.ms = 1;
    }
    public PhanSo( int ts, int ms ) {
        this.ts = ts;
        this.ms = ms;
    }
    public PhanSo cong( PhanSo p2 ) {
        return new PhanSo(this.ts*p2.ms + this.ms*p2.ts, this.ms*p2.ms);
    }
    public PhanSo tru( PhanSo p2 ) {
        return new PhanSo(this.ts*p2.ms - this.ms*p2.ts, this.ms*p2.ms);
    }
    public PhanSo nhan( PhanSo p2 ) {
        return new PhanSo(this.ts*p2.ts, this.ms*p2.ms);
    }
    public PhanSo chia( PhanSo p2 ) {
        return new PhanSo(this.ts*p2.ms, this.ms*p2.ts);
    }
    public PhanSo nghichDao() {
        return new PhanSo(this.ms, this.ts);
    }
    public int ucln() {
        int a = this.ts;
        int b = this.ms;
        while( b > 0 ) {
            int c = a%b;
            a = b;
            b = c;
        }
        
        return a;
    }
    public PhanSo doiDau() {
        return new PhanSo(-this.ts, this.ms);
    }
    public PhanSo toiGian() {
        return new PhanSo(this.ts / ucln(), this.ms / ucln());
    }
    public boolean bangNhau(PhanSo p2 ) {
        return this.toiGian().ts == p2.toiGian().ts && this.toiGian().ms == p2.toiGian().ms;
    }
    public double getValue() {
        return (double)this.ts/this.ms;
    }
    public boolean lonHon( PhanSo p2 ) {
        return this.getValue()-p2.getValue() > 0;
    }
    public boolean nhoHon( PhanSo p2 ) {
        return this.getValue()-p2.getValue() < 0;
    }
    
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        this.ts = sc.nextInt();
        while(true) {
            System.out.println("Nhap mau so ( mau so != 0 ) :");
            this.ms = sc.nextInt();
            if( this.ms != 0 ) break;
        }
    }
    public void hien() {
        System.out.println(this.ts + "/" + this.ms);
    }
}
