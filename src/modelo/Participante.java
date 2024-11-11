/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public class Participante extends Pessoa{
    private Curso curso;
    
    public Participante(String n, Curso c) {
        super(n);
        curso = c;
    }
    
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
}
