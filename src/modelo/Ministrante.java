/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public class Ministrante extends Pessoa{
    private String formacao;
    
    public Ministrante(String n) {
        super(n);
    }
    
    
    public String getFormacao(){
        return formacao;
    }
    
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

    @Override
    public String getInformacoes() {
        String aux = super.getInformacoes();
        aux += "\nFormação: "+formacao;
        return aux;
    }
    
    
    
}
