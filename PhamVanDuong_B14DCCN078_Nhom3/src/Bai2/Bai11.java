/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author phamduong
 */
public class Bai11 {
    public static void main(String[] args) {
        int a[][] = new int[4][];
        MATRIX.nhap(a, 3, 4);
        MATRIX.in(a, 3, 4);
        int b[][] = MATRIX.chuyenVi(a, 3, 4);
        MATRIX.in(b, 4, 3);
    }
}
