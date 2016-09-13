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
public class Bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao fullname :");
        String str = sc.nextLine();
        String[] pro = str.split(" ");
        StringBuilder res = new StringBuilder("");
        res.append(pro[pro.length - 1]);
        for( int i = 0; i< pro.length - 1; i++ ) {
            res.append(" ");
            res.append(pro[i]);
            
        }
        System.out.println("res =" + res);
    }
}
