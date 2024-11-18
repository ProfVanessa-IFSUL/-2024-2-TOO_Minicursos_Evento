/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vanessalagomachado
 */
public class Participante extends Pessoa{
    private Curso curso;
    private ArrayList<Oficina> listaOficinas;
    
    
    public Participante(String n, Curso c) {
        super(n);
        curso = c;
        listaOficinas = new ArrayList<>();
        
    }
    
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    @Override
    public String gerarCertificado() {
        String aux = "Certificado de participação nas oficinas: ";
        
        for(Oficina o: listaOficinas){
            aux += "\n- "+o.getNome()+" - CH: "+o.getCH();
        }
        return aux;
        
    }
    
    public void addOficina(Oficina o ){
        listaOficinas.add(o);
    }
}
