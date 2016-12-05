/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;
import java.util.*;
/**
 *
 * @author duong
 */
public class Bai08 {
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Integer n = new Integer(16);
        System.out.print("Them Integer 16, 35 vao ArrayList al1 /");
        al.add(n);
        al.add(new Integer(35));
        System.out.print("\tArrayList al1 :");
        for( Object e: al ) { System.out.print(" " + e);};
        System.out.print("\nTao ArrayList al2 Clone al1 /");
        ArrayList al2 = (ArrayList) al.clone();
        System.out.print("\tArrayList al2:");
        for( Object e : al2 ) {
            System.out.print(e + " ");
        }
        
    }
    
}
