/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author phamduong
 */
public class Bai03 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.nhap();
        rec.in();
        System.out.printf("Area :%f - Perimeter :%f", rec.findArea() , rec.findPerimeter());
    }
}
