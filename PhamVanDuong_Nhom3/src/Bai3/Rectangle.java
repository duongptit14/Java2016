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
public class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea () {
        return width * height;
    }
    public double findPerimeter () {
        return (double)(this.width + this.height ) * 2;
    }
    public void nhap () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong :");
        this.width = sc.nextDouble();
        
        System.out.println("Nhap chieu cao :");
        this.height = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap mau sac :");
        this.color = sc.nextLine();
    }
    public void in() {
        System.out.printf("Width :%f - Height :%f - Color : %s ", this.width, this.height , this.color );
        System.out.println("");
    }
}
