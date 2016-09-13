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
public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 cau :");
        String str = sc.nextLine();
        String[] pro = str.split(" ");
        for( int i = 0 ; i< pro.length - 1; i++ ) {
            for( int j = i+1; j< pro.length; j++ ) {
                if( pro[i].compareToIgnoreCase(pro[j]) >= 1 ) {
                    String tmp = pro[i];
                    pro[i] = pro[j];
                    pro[j] = tmp;
                }
            }
        }
        for( int i = 0; i< pro.length; i++ ) System.out.print(pro[i] + " ");
    }
}
