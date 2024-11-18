/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vanessalagomachado
 */
public class Ministrante extends Pessoa implements AgenteExterno{
    private String formacao;
    private Oficina oficina;
    
    
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
    
    

    @Override
    public String gerarCertificado() {
        return "Certificado de Ministrante da Oficina "+oficina.getNome()+" com CH "+oficina.getCH();
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
    public String toString(){
        return super.toString()+ " Ministrante em: "+oficina.getNome();
    }

    @Override
    public String gerarPagamento() {
        return "Pagamento de R$"+calcularHonorarios()+" realizado com sucesso";
    }

    @Override
    public double calcularHonorarios() {
        return 50 * oficina.getCH();
    }
    
    public double calcularHonorarios(double valorHora){
        return valorHora * oficina.getCH();
    }
    
}
