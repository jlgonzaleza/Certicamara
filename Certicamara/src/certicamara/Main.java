/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package certicamara;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sTexto="";
        try {
            sTexto = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            System.out.print(calc.Add("//[***]\n1***2***3"));
        } catch (Exception ex) {
             System.out.print(ex.getMessage());
        }
    }
}
