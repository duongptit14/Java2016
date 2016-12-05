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
public class BangQL {
    private ArrayList<QL> alQL;
    private ArrayList<BanDoc> alBanDoc;
    private ArrayList<Sach> alSach;
    public BangQL() {
        this.alQL = new ArrayList<QL>();
        this.alBanDoc = new ArrayList<BanDoc>();
        this.alSach = new ArrayList<Sach>();
    }
    public BangQL( ArrayList<QL> alQL, ArrayList<BanDoc> alBanDoc, ArrayList<Sach> alSach ) {
        this.alQL = alQL;
        this.alBanDoc = alBanDoc;
        this.alSach = alSach;
    }
    public void addQL( QL ql ) {
        this.alQL.add(ql);
    }
    public boolean daTonTai( int id_BanDoc, int id_Sach ) {
        System.out.println("Chay vao daTontai");
        if( this.alQL.size() == 0 ) {
            System.out.println("Chay vao if");
            return false;
        }
        for( QL ql : alQL ) {
            if( ql.getBanDoc().getMa() == id_BanDoc && ql.getSach().getMa() == id_Sach  ) return true;
        }
        return false;
    }
    public void nhapBangQL() {
//        System.out.println("Chay vao day");
//        this.alBanDoc = ProFile.readFile(Main.nameFileBanDoc);
//        for( BanDoc bd : alBanDoc ) {
//            System.out.println(bd);
//        }
//        System.out.println("A");
//        this.alSach = ProFile.readFile(Main.nameFileSach);
//        System.out.println("B");
        alBanDoc.forEach((BanDoc bd ) -> {
            System.out.println("______Nhap thong tin sach cho ban doc :" + bd.getTen() + "_______");
            
            int sl = 0;
            Scanner sc = new Scanner(System.in);
            while( true ) {
                System.out.println("Nhap vao dau sach (0->5):");
                sl = Integer.parseInt(sc.nextLine());
                if( sl >= 0 && sl <= 5 ) break;
                System.out.println("Nhap lai !");
            }
            for( int i = 0; i< sl; i++ ) {
                int id_Sach = 0;
                while( true ) {
                    System.out.println("Nhap vao ma sach can muon thu " + (i+1) + " :");
                    id_Sach = Integer.parseInt(sc.nextLine());
                    
//                    boolean kt = false;
                    Sach sach = null;
                    for( Sach s : alSach ) {
                        if( s.getMa() == id_Sach ) {
                            sach = s;
//                            kt = true;
                            break; // tim thay sach trong ArrayList sach
                        }
                    }
                    if(sach != null ) { // tim thay sach
                        if( daTonTai(bd.getMa(), id_Sach)) { // BanDoc-Sach da ton tai trong BangQL
                            System.out.println("Ban doc da muon sach nay, vui long chon sach khac !");
                        }
                        else {
                            int count = 0; // so luong sach moi dau sach
                            while( true ) {
                                System.out.println("Nhap vao so luong dau sach (0->3) :");
                                count = Integer.parseInt(sc.nextLine());
                                if( count >= 0 && count <= 3 ) break;
                                System.out.println("Khong thoa man dieu kien, nhap lai !");
                            }
                            alQL.add(new QL(bd, sach, count, "Sach da rach nat"));
                            break;
                        }
                    }
                    else System.out.println("Sach khong co trong kho, vui long nhap lai !");
                }
                
                
            }
        });
    }
    public void Sort_TenBanDoc() {
        Collections.sort(alQL, (QL ql1, QL ql2 ) -> {
            return ql2.getBanDoc().getTen().compareToIgnoreCase(ql1.getBanDoc().getTen());
        });
    }
    public void Sort_SoLuongSach() {
        Collections.sort(alQL, (QL ql1, QL ql2 ) -> {
            return ql1.getSl()< ql2.getSl() ?1:-1;
        });
    }
    public void hienThiBangQL() {
        alQL.forEach((QL ql ) -> {
            System.out.println("________________________________________");
            System.out.println(ql);
        });
    }
}
