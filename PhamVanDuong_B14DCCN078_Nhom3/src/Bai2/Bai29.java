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
public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] pro1 = str1.split(" ");
        String[] pro2 = str2.split(" ");
        StringBuilder giao = new StringBuilder("");
        StringBuilder hieu = new StringBuilder("");
        for( int i = 0; i< pro1.length; i++ ) {
            boolean isFind = false;
            for( int j = 0; j< pro2.length; j++ ) {
                if( pro1[i].equals(pro2[j])) {
                    isFind = true;
                    giao.append(pro1[i]);
                    giao.append(" ");
                    break;
                }
            }
            if( isFind == false ) {
                hieu.append(pro1[i]);
                hieu.append(" ");
            }
        }
        System.out.println("Giao :" + giao);
        System.out.println("Hieu s1\\s2 :" + hieu);
        StringBuilder hop = new StringBuilder(hieu.toString());
        hop.append(giao.toString());
        for( int i = 0; i< pro2.length; i++ ) {
            boolean isFind = false;
            for( int j = 0; j< pro1.length; j++ ) {
                if( pro2[i].equals(pro1[j])) {
                    isFind = true;
                    break;
                }
            }
            if( isFind == false ) {
                hop.append(pro2[i]);
                hop.append(" ");
            }
        }
        System.out.println("Hop :" + hop);
    }
}
