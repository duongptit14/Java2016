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
public class Bai05 {
    public static int[] res;
    public static void outFile(int[] a, int n, PrintWriter pw ) {
        for( int i = 0; i<n; i++ ) pw.write(a[i] + " ");
        pw.write("\n");
    }
    public static void merge(int[] a, int[] b, int[] c , PrintWriter pw) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        while( current1 < a.length && current2 < b.length) {
            if( a[current1] < b[current2] ) c[current3++] = a[current1++];
            else c[current3++] = b[current2++];
        }
        while( current1 < a.length ) c[current3++] = a[current1++];
        while( current2 < b.length ) c[current3++] = b[current2++];
        outFile(res, res.length, pw);
    }
    public static void Sort( int[] a, int n, PrintWriter pw ) {
        if( n > 1 ) {
            int mid = a.length/2;
            int[] first = new int[mid];
            System.arraycopy(a, 0, first, 0, mid);
            int last = n - mid;
            int[] seconds = new int[last];
            System.arraycopy(a, mid, seconds, 0, last);
            Sort(first, mid, pw);
            Sort(seconds, last, pw);
            merge(first, seconds, a, pw);
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
        res = a;
        for( int i = 0; i<n; i++ ) a[i] = sc.nextInt();
        sc.close();
        File out = new File("SXTRON.txt");
        PrintWriter pw = new PrintWriter(out);
        Sort(a, n, pw);
        pw.close();
    }
}
