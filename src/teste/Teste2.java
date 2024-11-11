/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Date;
import modelo.Curso;
import modelo.Local;
import modelo.Ministrante;
import modelo.Oficina;
import modelo.Organizador;
import modelo.Participante;
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
        aa.setMinistrante(new Ministrante("Juka"));
        aa.setLocal(Local.PREDIO5);
        
        Organizador org = new Organizador("Bento");
        aa.setOrganizador(org);
        
        Participante p1 = new Participante("Maria", Curso.BCC);
        Participante p2 = new Participante("Jaoo", Curso.BCC);
        
//        aa.getListaParticipante().add(p2);
        
//        aa.addPartipante(p1);
//        aa.addPartipante(p2);
        
        System.out.println("Oficina 1: "+aa.getInformacoes());
        System.out.println("Locais Cadastrados: ");
        System.out.println(Local.getLocais());
        System.out.println("---");
        System.out.println(aa.mostrarListaParticipantes());
    }
}
