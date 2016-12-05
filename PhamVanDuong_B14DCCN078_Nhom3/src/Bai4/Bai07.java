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
public class Bai07 {
    
    public static void BS(int[] a, int n, int x, PrintWriter pw ) {
        int left = 0;
        int right = n-1;
        boolean OK = false;
        while( left <= right ) {
            int mid = (left + right ) /2;
            boolean isEqual = (a[mid]==x);
            System.out.println(isEqual);
            String str = String.format("%d = %d ? %s\n", a[mid], x, isEqual);
            pw.write(str);
            if( isEqual ) {
                pw.write("Result is " + mid);
               OK = true;
                break;
            }
            if( a[mid] < x ) left = mid+1;
            else right = mid-1;
        
        }
        if( !OK ) {
            pw.write("Khong tim thay");
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("SORTEDLIST.txt");
        if( !file.exists() ) {
            System.out.println("Khong tim thay file");
            System.exit(0);
        }
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for( int i = 0; i<n; i++ ) a[i] = sc.nextInt();
        sc.close();
        sc = new Scanner(System.in);
        System.out.println("Nhap vao so can tim:");
        int x = sc.nextInt();
        File out = new File("TIMKIEMNHIPHAN.txt");
        PrintWriter pw = new PrintWriter(out);
        BS(a, n, x, pw);
        pw.close();
    }
}
