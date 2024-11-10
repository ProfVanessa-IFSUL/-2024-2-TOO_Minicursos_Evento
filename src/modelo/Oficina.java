/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vanessalagomachado
 */
public class Oficina {
    private String nome;
    private String descricao;
    private int CH;
    private Date dataInicio;
    private int vagas;
    private Pessoa ministrante;
    
    private Local local;
    
    public Oficina(String nome){
        this.nome = nome;
    }
    
    // getter
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getCH(){
        return CH;
    }
    public Date getDataInicio(){
        return dataInicio;
    }
    public int getVagas(){
        return vagas;
    }
    
    public Pessoa getMinistrante(){
        return ministrante;
    }
    public void setMinistrante(Pessoa m){
        this.ministrante = m;
    }
    
    public Local getLocal(){
        return this.local;
    }
    
    
    // setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String des){
        descricao = des;
    }
    public void setVagas(int vagas){
        this.vagas = vagas;
    }
    public void setCH(int CH){
        this.CH = CH;
    }
    public void setDataInicio(Date dt){
        this.dataInicio = dt;
    }
    
    public void setLocal(Local local){
        this.local = local;
    }
    
    
    public String getInformacoes(){
        SimpleDateFormat mascaraData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        String aux = "Oficina cadastrada:";
        if(nome != null){
            aux += "\n Oficina: "+nome;
        }
        aux += descricao != null ? "\n descrição: "+nome : "";
        aux += CH > 0 ? "\nCH: "+CH : "";
        aux += dataInicio != null ? "\nData: "+mascaraData.format(dataInicio) : "";
       aux += vagas > 0 ? "\nVagas: "+vagas : "";
       aux += ministrante !=null ? "\nMinistrante: "+ministrante.getNome(): "";
       //aux += local != null ? "\nLocal: "+local +" - lotação: "+local.getLotacao(): "";
       aux += local != null ? "\nLocal: "+local : "";
        return aux;
    }
    
}
