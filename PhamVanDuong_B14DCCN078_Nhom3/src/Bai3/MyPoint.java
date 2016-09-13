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
public class MyPoint {
    private double x;
    private double y;
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint( double x, double y ) {
        this.x = x;
        this.y = y;
    }
    public MyPoint( MyPoint p ) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    public double distance( MyPoint secondPoint ) {
        double tmp1 = Math.pow(this.x - secondPoint.x, 2);
        double tmp2 = Math.pow(this.y - secondPoint.y, 2);
        double res = Math.sqrt(tmp1 + tmp2);
        return res;
    }
    public static double distance( MyPoint p1, MyPoint p2 ) {
        double tmp1 = Math.pow(p1.x - p2.x, 2);
        double tmp2 = Math.pow(p1.y - p2.y, 2);
        double res = Math.sqrt(tmp1 + tmp2);
        return res;
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
