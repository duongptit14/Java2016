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
public class Bai12 {
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Cong, tru 2 ma tran");
        System.out.println("2. Tich 2 ma tran");
        System.out.println("3. Ma tran chuyen vi");
        System.out.println("4. Quit");
        int choose;
        while(true) {
            choose = sc.nextInt();
            if( choose == 4 ) break;
            switch(choose) {
                case 1:
                    System.out.println("Nhap kich thuoc ma tran 1:");
                    int m = sc.nextInt();
                    int n = sc.nextInt();
                    Matrix m1 = new Matrix(m, n);
                    m1.input();
                    System.out.println("Nhap kich thuoc ma tran 2:");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    Matrix m2 = new Matrix(m, n);
                    m2.input();
                    System.out.println("\t1. Cong\t2. Tru");
                    int tmp = sc.nextInt();
                    Matrix res;
                    if( tmp == 1 ) {
                        res = m1.add(m2);
                    }
                    else res = m1.sub(m2);
                    if( res != null ) res.print();
                    break;
                case 2:
                    System.out.println("Nhap kich thuoc ma tran 1:");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    Matrix mm1 = new Matrix(x, y);
                    mm1.input();
                    System.out.println("Nhap kich thuoc ma tran 2:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    Matrix mm2 = new Matrix(x, y);
                    mm2.input();
                    Matrix ress = mm1.mul(mm2);
                    if( ress != null ) ress.print();
                    break;
                case 3:
                    System.out.println("Nhap kich thuoc ma tran :");
                    int r = sc.nextInt();
                    int c = sc.nextInt();
                    Matrix matrix = new Matrix(r, c);
                    matrix.input();
                    Matrix matrix2 = matrix.transpose();
                    matrix2.print();
                    break;
                default :
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
    }
}
