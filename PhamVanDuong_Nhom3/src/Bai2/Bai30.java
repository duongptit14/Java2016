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
public class Bai30 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
//        System.out.println(str1.lastIndexOf(str2));
        
        while(true) {
            if( sb1.indexOf(str2) != -1 ) {
//                System.out.println("truoc :" + sb1);
                sb1.delete(sb1.indexOf(str2), sb1.indexOf(str2) + sb2.length());
//                System.out.println("Sau :" + sb1);
            }
            else break;
        }
        System.out.println("sb1 :" + sb1);
    }
   
}
