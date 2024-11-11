/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.ArrayList;

/**
 *
 * @author vanessalagomachado
 */
public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista;
        
        lista = new ArrayList<>();
//        = new ArrayList();
        
//        lista.add(10);
        lista.add("Vanessa");
//        lista.add(false);
        
        System.out.println("Lista: "+lista);
        
        lista.remove("Vanessa");
        
        System.out.println("Lista 2: "+lista);
    }
}
