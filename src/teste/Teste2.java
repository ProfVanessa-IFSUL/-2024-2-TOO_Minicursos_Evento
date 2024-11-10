/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Date;
import modelo.Local;
import modelo.Oficina;
import modelo.Pessoa;

/**
 *
 * @author vanessalagomachado
 */
public class Teste2 {
    public static void main(String[] args) {
        Oficina aa = new Oficina("Python");
        aa.setDescricao("Introdução ao Python");
        aa.setDataInicio(new Date());
        aa.setMinistrante(new Pessoa("Juka"));
        aa.setLocal(Local.PREDIO5);
        
        System.out.println("Oficina 1: "+aa.getInformacoes());
        
        System.out.println(Local.getLocais());
    }
}
