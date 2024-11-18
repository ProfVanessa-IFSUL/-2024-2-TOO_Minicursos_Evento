/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public class Organizador extends Pessoa{
    
    private Oficina oficina;
    
    public Organizador(String n) {
        super(n);
    }

    @Override
    public String gerarCertificado() {
        return "Certificado de Organizador da Oficina "+oficina.getNome();
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    @Override
    public String toString() {
        return super.toString() + "(ORGANIZADOR)";
    }
    
    
    
}
