/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;
import java.util.*;
import java.io.*;
/**
 *
 * @author duong
 */
public class Bai06 {
    
    public static void Search(int[] a, int n, int x , PrintWriter pw) {
        boolean OK = false;
        for( int i = 0; i<n; i++ ) {
            String str = String.format("%d = %d ? ", a[i], x);
            pw.write(str);
            if( a[i] == x ) {
                pw.write("YES\n");
                pw.write("Result is " + i);
                OK = true;
                break;
            }
            else pw.write("NO\n");
        }
        if( !OK ) {
            pw.write("Khong tim thay");
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DAYSO.txt");
        if( !file.exists() ) {
            System.out.println("Khong co file");
            System.exit(0);
        }
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for( int i = 0; i<n; i++ ) a[i] = sc.nextInt();
        sc.close();
        System.out.println("Nhap so can tim kiem:");
        sc = new Scanner(System.in);
        int x = sc.nextInt();
        File out = new File("TIMKIEMTUANTU.txt");
        PrintWriter pw = new PrintWriter(out);
        Search(a, n, x, pw);
        pw.close();
        
    }
}
