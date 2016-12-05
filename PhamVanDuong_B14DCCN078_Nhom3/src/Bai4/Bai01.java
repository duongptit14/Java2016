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
public class Bai01 {
    public static int step = 0;
    public static void outFile( int[] a, int n, PrintWriter pw ) {
        pw.write("Step " + step++ + " :");
        for( int i = 0; i<n; i++ ) pw.write(a[i] + " ");
        pw.write("\n");
    }
    public static void process( int[] a, int n, PrintWriter pw) {
        for( int i  = 0; i< n-1; i++ ) {
            int index = i;
            for( int j = i+1; j<n; j++ ) {
                if( a[j] < a[index] ) index = j;
            }
            int tmp = a[i];
            a[i] = a[index];
            a[index] = tmp;
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
        File out = new File("SXCHON.TXT ");
        PrintWriter pw = new PrintWriter(out);
        process(a, n, pw);
        pw.close();
    }
}
