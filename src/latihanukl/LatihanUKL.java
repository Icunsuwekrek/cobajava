/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl;

/**
 *
 * @author ichsan sani al azmi
 */
public class LatihanUKL {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
int a=4, b=9;
          int jumlah = 6;
        
        for (int i=1; i<=jumlah; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(a+ "\t");
                a=a+b;
            } 
            System.out.println("");
        }
            for (int i=jumlah-1; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(a +"\t");
                a=a+b;
            } 
            System.out.println("");
        }
}
}