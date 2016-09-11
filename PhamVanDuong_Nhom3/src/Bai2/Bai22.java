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
public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder("");
        for( int i = 0; i< str.length(); i++ ) {
            if( i%2 == 0 ) {
                res.append(Character.toUpperCase(str.charAt(i)));
            }
            else res.append(Character.toLowerCase(str.charAt(i)));
        }
        System.out.println("Result is :" + res);
    }
}
