/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.*;
/**
 *
 * @author phamduong
 */
public class Bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau :");
        String str = sc.nextLine();
        String[] pro = str.split(" ");
        int index = 0;
        int Max = 0;
        for( int i = 0; i< pro.length; i++ ) {
            if( pro[i].length() > Max ) {
                Max = pro[i].length();
                index = i;
            }
        }
        System.out.println("Tu dai nhat :" + pro[index] +" o vi tri :" + index);
        System.out.println("Chieu dai :" + Max);
    }
}
