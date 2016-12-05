/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author duong
 */
public class Bai02 {
    public static int step = 0;
    public static void outFile( int[] a, int n, PrintWriter pw ) {
        pw.write("Step " + step++ + " :");
        for( int i = 0; i<n; i++ ) pw.write(a[i] + " ");
        pw.write("\n");
    }
    public static void process( int[] a, int n, PrintWriter pw) {
        for( int i = 1; i<n; i++ ) {
            int tmp = a[i];
            int k = i-1;
            while( k >= 0 && a[k] > tmp ) {
                a[k+1] = a[k];
                k--;
            }
            a[k+1] = tmp;
            outFile(a, n, pw);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DAYSO.TXT");
        if( !file.exists()) {
            System.out.println("Chua co file");
            System.exit(0);
        }
        Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        for( int i = 0; i<n;i++ ) a[i] = sc.nextInt();
        sc.close();
        File out = new File("SXCHEN.TXT ");
        PrintWriter pw = new PrintWriter(out);
        process(a, n, pw);
        pw.close();
    }
}
