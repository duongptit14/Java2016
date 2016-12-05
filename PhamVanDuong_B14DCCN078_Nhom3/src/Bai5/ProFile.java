/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author duong
 */
public class ProFile {
    
    public static <T> void writeFile( ArrayList<T> al, String filename ) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(al);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ProFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static <T> ArrayList<T> readFile( String filename ) {
        
        ArrayList<T> al = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            al = (ArrayList<T>)in.readObject();
            in.close();
        } catch (Exception ex) {
            Logger.getLogger(ProFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
        
    }
    
}
