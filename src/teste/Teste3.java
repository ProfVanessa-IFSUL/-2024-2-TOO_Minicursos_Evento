/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.Ministrante;

/**
 *
 * @author vanessalagomachado
 */
public class Teste3 {
    public static void main(String[] args) {
        Ministrante ministrante = new Ministrante("Luciana");
        ministrante.setPeso(60);
        ministrante.setFormacao("Especialista em Python");
        System.out.println(ministrante.getInformacoes());
    }
}
