/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.Pessoa;

/**
 *
 * @author vanessalagomachado
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joana");
        p.setPeso(60);
//        p.setAltura(1.65);
        
        System.out.println(p.getInformacoes());
        
        Pessoa p2 = new Pessoa("Joao", 75, 1.75);
//        System.out.println("Pessoa Cadastrada: "+p2.getNome()+
//                " peso: "+p2.getPeso()+", altura: "+p2.getAltura());
        System.out.println(p2.getInformacoes());
    }
}
