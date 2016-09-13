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
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong diem :");
        int n = sc.nextInt();
        MyPoint[] ds = new MyPoint[100];
        for( int i = 0; i<n; i++ ) {
            System.out.println("Nhap lan luot toa do x va y cho diem " + i + ": ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            ds[i] = new MyPoint(x,y);
        }
        double Max = 0;
        int index1 = 0, index2 = 1;
        for( int i = 0;i<n-1; i++ ) {
            for( int j = i+1; j<n; j++ ) {
                double tmp = MyPoint.distance(ds[i], ds[j]);
                if( tmp > Max ) {
                    index1 = i;
                    index2 = j;
                    Max = tmp;
                }
            }
        }
        System.out.println("2 diem co khoang cach lon nhat :" + ds[index1].toString()+ " va " + ds[index2].toString());
        System.out.println("Khoang cach :" + Max);
    }
}
