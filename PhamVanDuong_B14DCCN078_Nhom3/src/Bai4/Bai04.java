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
public class Bai04 {
    public static int[] res;
    
    public static void outFile(int[] a, int n, PrintWriter pw ) {
        for( int i = 0; i<n; i++ ) pw.write(a[i] + " ");
        pw.write("\n");
    }
    public static void Sort( int[] a, int n, int low, int high , PrintWriter pw ) {
        int i = low;
        int j = high;
        int pivot = a[(i+j)/2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while ( a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
//                display(res);
            }
        }
        outFile(res, n, pw);
        if (j > low) {
            Sort(a,n,low, j, pw);
        }
        if (i < high) {
            Sort(a,n, i, high, pw);
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
        File out = new File("SXNHANH.txt");
        PrintWriter pw = new PrintWriter(out);
        Sort(a,n, 0, n-1, pw);
        pw.close();
    }
}
