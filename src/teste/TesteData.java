/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanessalagomachado
 */
public class TesteData {
    public static void main(String[] args) {
        
        try {
            SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            
            Date dt = new Date();
            dt = mascaraData.parse("10/09/2020");
            System.out.println("Data: "+mascaraData.format(dt));
        } catch (ParseException ex) {
            System.out.println("Data inválida");
        }
    }
}
