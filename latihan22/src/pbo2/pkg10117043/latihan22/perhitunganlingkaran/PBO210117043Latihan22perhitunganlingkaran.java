/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk perhitungan 
 *                        lingkaran
 * @author Acer
 */
public class PBO210117043Latihan22perhitunganlingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String d;//validasi
        double diameter;
        double r;
        double l;
        double k;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=======Perhitungan Lingkaran========");
        
        do{
            System.out.print("masukkan nilai diameter lingkaran: ");
            d = scn.nextLine();
            //validasi input
            System.out.println((!d.matches("[0-9]*"))?"nilai diameter tidak sesuai\n":"");
        
        }while(!d.matches("[0-9]*"));
        
        System.out.println("\n======hasil perhitungan lingkaran=======");
        //konversi string ke double
        diameter = Double.parseDouble(d);
        r = diameter/2;
        System.out.printf("jari-jari lingkaran = %.0f cm%n",r);
        l = Math.PI*r*r;
        System.out.printf("luas lingkaran = %.2f cm%n",l);
        k = 2*Math.PI*r;
        System.out.printf("keliling lingkaran = %.2f cm %n",k);
        
        
    }
    
}
