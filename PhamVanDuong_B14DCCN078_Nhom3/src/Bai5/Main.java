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
public class Main {
    public static final String nameFileBanDoc = "BANDOC.TXT";
    public static final String nameFileSach = "SACH.TXT";
    public static void menu() {
        System.out.println("1. Nhap them sach");
    }
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<BanDoc> alBanDoc = ProFile.readFile(nameFileBanDoc);
        ArrayList<Sach> alSach = ProFile.readFile(nameFileSach);
        
        for( BanDoc bd : alBanDoc ) {
            System.out.println(bd);
        }
        for( Sach sach : alSach ) {
            System.out.println(sach);
        }
        BangQL bangQL = new BangQL(new ArrayList<QL>(), alBanDoc, alSach);
        bangQL.nhapBangQL();
        bangQL.hienThiBangQL();
        bangQL.Sort_TenBanDoc();
        bangQL.hienThiBangQL();
//        ArrayList<BanDoc> alBanDoc = new ArrayList<BanDoc>();
//        ArrayList<Sach> alSach = new ArrayList<Sach>();
//        for( int i = 0; i<2; i++ ) {
//            BanDoc bd = new BanDoc();
//            bd.nhap(sc, false);
//            alBanDoc.add(bd);
//        }
//        for( int i = 0; i<2; i++ ) {
//            Sach sach = new Sach();
//            sach.nhap(sc, false);
//            alSach.add(sach);
//        }
//        ProFile.writeFile(alBanDoc, nameFileBanDoc);
//        ProFile.writeFile(alSach, nameFileSach);
        
//        pwBanDoc.close();
//        pwSach.close();
    }
    
}
