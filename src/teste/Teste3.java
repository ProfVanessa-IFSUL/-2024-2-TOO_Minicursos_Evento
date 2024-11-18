/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Date;
import javax.swing.JOptionPane;
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
public class Teste3 {
    public static void main(String[] args) {
        
        Oficina aa = new Oficina("Python");
        aa.setDescricao("Introdução ao Python");
        aa.setDataInicio(new Date());
        aa.setMinistrante(new Ministrante("Juka"));
        aa.setLocal(Local.PREDIO5);
        aa.setCH(10);
        
        
        Ministrante ministrante = new Ministrante("Luciana");
        ministrante.setPeso(60);
        ministrante.setFormacao("Especialista em Python");
        ministrante.setOficina(aa);
        
        System.out.println(ministrante.getInformacoes());
        System.out.println(ministrante.gerarCertificado());
        
        
        
        
        Organizador org = new Organizador("Bento");
        aa.setOrganizador(org);
        org.setOficina(aa);
        
        Participante p1 = new Participante("Maria", Curso.BCC);
        p1.addOficina(aa);
        Participante p2 = new Participante("Jaoo", Curso.BCC);
        p2.addOficina(aa);
        
        Pessoa listaPessoasCadastradas[] = {ministrante, p1, p2, org};
        
        Pessoa pSel = (Pessoa)JOptionPane.showInputDialog(null, 
                "Selecione uma pessoa", 
                "Pessoas Cadastradas", 
                0, 
                null, 
                listaPessoasCadastradas, 
                ministrante);
        
        
        JOptionPane.showMessageDialog(null, pSel.gerarCertificado());
        
        if(pSel instanceof Ministrante){
            Ministrante m = (Ministrante) pSel;
            JOptionPane.showMessageDialog(null, m.gerarPagamento());
            
        }
        
    }
}
